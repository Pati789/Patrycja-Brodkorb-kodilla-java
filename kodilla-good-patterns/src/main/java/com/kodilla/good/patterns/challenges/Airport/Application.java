package com.kodilla.good.patterns.challenges.Airport;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        FlightService flightService = new FlightService();

        List<Flights> fromWarsaw = flightService.flightsFrom("Warszawa");
        System.out.println("Flights found: " +fromWarsaw);


        List<Flights> toGdańsk = flightService.flightsTo("Gdańsk");
        System.out.println("Flights found: " + toGdańsk);

    }


}
