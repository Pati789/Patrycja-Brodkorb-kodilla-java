package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 4;
        double b = 2;

        //When
        double result1 = calculator.add(a,b);
        double result2 = calculator.sub(a,b);
        double result3 = calculator.mul(a,b);
        double result4 = calculator.div(a,b);

        //Then
        assertEquals(6, result1);
        assertEquals(2, result2);
        assertEquals(8, result3);
        assertEquals(2, result4);
    }
}
