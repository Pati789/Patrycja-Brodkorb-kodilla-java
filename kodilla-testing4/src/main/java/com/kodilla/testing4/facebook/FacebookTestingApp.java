package com.kodilla.testing4.facebook;

import com.kodilla.testing4.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    private static final String XPATH_CREATE = "//div[contains(@class, \"_6ltg\")]/a";

    private static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";

    private static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";

    private static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//div[contains(@class, \"_9xo5\")]/button[2]")).click();
        driver.findElement(By.xpath(XPATH_CREATE)).click();


        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selDay = new Select(selectDay);
        selDay.selectByIndex(12);
        Thread.sleep(5000);


        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selMonth = new Select(selectMonth);
        selMonth.selectByIndex(8);
        Thread.sleep(5000);


        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selYear = new Select(selectYear);
        selYear.selectByIndex(31);
        Thread.sleep(5000);

        driver.close();


    }
}



