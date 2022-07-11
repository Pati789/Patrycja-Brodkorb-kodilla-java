package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("London", true);
        flightMap.put("Paris", true);
        flightMap.put("Amsterdam", true);
        flightMap.put("Frankfurt", true);
        flightMap.put("Madrid", false);
        flightMap.put("Munich", false);
        flightMap.put("Moscow", true);

       Boolean departureAirport = flightMap.get(flight.getDepartureAirport());
       Boolean arrivalAirport = flightMap.get(flight.getArrivalAirport());

       if (arrivalAirport ==null || !arrivalAirport) {
           throw new RouteNotFoundException("SORRY! Can't find such a flight:" + flight);
       }

       if (departureAirport == null || !departureAirport) {
           throw new RouteNotFoundException("SORRY! Can't find such a flight: "+ flight);
       }
        System.out.println("FLIGHT FOUND: " +flight);



        }
}
