package com.kodilla.exception.test;

public class FlightApplication {

    public static void main(String[] args) {
        Flight flight1 = new Flight ("Amsterdam", "Munich");
        Flight flight2 = new Flight ("Madrid", "Munich");
        Flight flight3 = new Flight ("Frankfurt", "London");
        Flight flight4 = new Flight ("Paris", "Moscow");
        Flight flight5 = new Flight ("Madrid", "Frankfurt");

        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight1);
        } catch  (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            flightFinder.findFlight(flight2);
        } catch  (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            flightFinder.findFlight(flight3);
        } catch  (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            flightFinder.findFlight(flight4);
        } catch  (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            flightFinder.findFlight(flight5);
        } catch  (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

}
