package com.kodilla.good.patterns.challenges.Airport;

import java.util.Objects;

public class Flights {

    private String departure;
   private String arrival;

    public Flights(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return  "\n" +"departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(departure, flights.departure) && Objects.equals(arrival, flights.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }
}
