package com.kodilla.good.patterns.challenges.Airport;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    private final List <Flights> flightsList = new ArrayList<>();
    public FlightService() {

        flightsList.add(new Flights("Wrocław", "Warszawa"));
        flightsList.add(new Flights("Warszawa", "Kraków"));
        flightsList.add(new Flights("Kraków", "Wrocław"));
        flightsList.add(new Flights("Warszawa", "Gdańsk"));
        flightsList.add(new Flights("Warszawa", "Wrocław"));
    }

    public List<Flights> flightsFrom (String place) {
        return flightsList.stream()
                .filter(flight->flight.getDeparture().equals(place))
                .collect(Collectors.toList());

    }

    public List<Flights> flightsTo(String place) {
        return flightsList.stream()
                .filter(flight -> flight.getArrival().equals(place))
                .collect(Collectors.toList());
    }
}

