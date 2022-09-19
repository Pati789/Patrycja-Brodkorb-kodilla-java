package com.kodilla.testing4.crudapp;

import com.kodilla.testing4.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class CrudAppTestSuite {

    private static final String BASE_URL = "https://Pati789.github.io";
    private WebDriver driver;
    private Random generator;

    @BeforeEach
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
        generator = new Random();
    }

//    @AfterEach
//    public void cleanUpAfterTest() {
//        driver.close();
//    }


    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
            driver.navigate().refresh();                                         // [1]

            while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());   // [2]

            driver.findElements(
                            By.xpath("//form[@class=\"datatable__row\"]")).stream()           // [3]
                    .filter(anyForm ->                                             // [4]
                            anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")) // [5]
                                    .getText().equals(taskName))                        // [6]
                    .forEach(theForm -> {                                          // [7]
                        WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));    // [8]
                        Select select = new Select(selectElement);                 // [9]
                        select.selectByIndex(1);                                   // [10]

                        WebElement buttonCreateCard =                              // [11]
                                theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]")); // [12]
                        buttonCreateCard.click();                                  // [13]
                    });                                                            // [14]
            Thread.sleep(5000);                                                  // [15]
        }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        final String TRELLO_BOARDS_URL = "https://trello.com/b/5QQ1rH5r/kodilla-application";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("pbrodkorb@wp.pl");
        WebElement el = driverTrello.findElement(By.id("login"));
        el.submit();	// [3]
        Thread.sleep(4000);

        driverTrello.findElement(By.id("password")).sendKeys("Patrycja123321");
        driverTrello.findElement(By.id("login-submit")).submit();

        Thread.sleep(4000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-title\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Kodilla Application\"]")).size() > 0)
                .forEach(WebElement::click);

        Thread.sleep(4000);

        driverTrello.get(TRELLO_BOARDS_URL);



        result = driverTrello.findElements(By.xpath(".//span")).stream()
                .anyMatch(theSpan -> theSpan.getText().equals(taskName));

        driverTrello.close();

        return result;
    }


    private void deleteTaskFromCrudApp(String taskName) throws InterruptedException {

       driver.findElements(By.xpath("//form[contains (@class, \"datatable__row\")]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath("//fieldset[1]/p[@class=\"datatable__field-value\"")).getText().equals(taskName))
                .forEach(button -> button.findElement(By.xpath("//div/fieldset[1]/button[4]")).click());
        Thread.sleep(4000);
    }


    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));
        deleteTaskFromCrudApp(taskName);
    }
}
