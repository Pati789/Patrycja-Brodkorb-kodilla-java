package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

private List<Continent> continents = new ArrayList<>();

public void addContinent(Continent continent) {
    continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
    return continents.stream()
            .flatMap(country -> country.getCountryList().stream())
            .map(country -> country.getPeopleQuantity())
            .reduce(BigDecimal.ZERO, (sum, element) -> sum = sum.add(element));

    }
}
