package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AgressivePredictor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CustomerTestSuite {

    @Test
    void testDefaultInvestingStrategies() {
        //Given
        Customer steven = new IndividualCustomer("Steven Links");
        Customer john = new IndividualYoungCustomer("John Hemerald");
        Customer kodilla = new CorporateCustomer("Kodilla");

        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        String johnShouldBuy = john.predict();
        System.out.println("John should: " + johnShouldBuy);
        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kodilla should: " + kodillaShouldBuy);

        //Then
        assertEquals("[Conservative predictor] Buy debentures of XYZ", stevenShouldBuy);
        assertEquals("[Agressive predictor] Buy stock of XYZ", johnShouldBuy);
        assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", kodillaShouldBuy);
    }

    @Test
    void testIndividualInvestingStrategy() {
        //Given
        Customer steven = new IndividualCustomer("Steven Links");

        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        steven.setBuyingStrategy(new AgressivePredictor());
        stevenShouldBuy = steven.predict();
        System.out.println("Steven now should: " + stevenShouldBuy);

        //Then
        assertNotEquals("[Aggressive predictor] Buy stock of XYZ", stevenShouldBuy);
    }

}
