package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

@Test
    void testGetPopulation() {
    //Given
    Country poland = new Country(new BigDecimal("20000000"));
    Country germany = new Country(new BigDecimal("400000000"));
    Country spain = new Country(new BigDecimal("30000000"));
    Country china = new Country(new BigDecimal("5000000000"));
    Country india = new Country(new BigDecimal("230000000"));
    Country cuba = new Country(new BigDecimal("300000000"));
    Country usa = new Country(new BigDecimal("600000000"));

    Continent asia = new Continent();
    Continent america = new Continent();
    Continent europe = new Continent();

    asia.addCountry(china);
    asia.addCountry(india);
    america.addCountry(usa);
    america.addCountry(cuba);
    europe.addCountry(germany);
    europe.addCountry(poland);
    europe.addCountry(spain);

    World world = new World();
    world.addContinent(asia);
    world.addContinent(america);
    world.addContinent(europe);

    //When
    BigDecimal worldPopulation = world.getPeopleQuantity();
    //Then
    BigDecimal totalPopulation = new BigDecimal("6580000000");
    Assertions.assertEquals(totalPopulation, worldPopulation);


}

}
