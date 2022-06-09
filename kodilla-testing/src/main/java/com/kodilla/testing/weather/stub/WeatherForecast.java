package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;
    private double sum;
    private double mean;
    private int quantity;
    private double median;


    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
        temperatures.getTemperatures().entrySet()) {
        resultMap.put(temperature.getKey(), temperature.getValue() +1.0);

        }
        return resultMap;
    }

    public double meanCalc() {
        for(Map.Entry<String, Double> temperature:
        temperatures.getTemperatures().entrySet()) {
            sum+= temperature.getValue();
            quantity ++;
        }
        return mean = sum/quantity;
    }

    public double medianCalc() {
        List<Double> temperaturesOrder = new ArrayList<>();
        for(Map.Entry<String, Double> temperature:
        temperatures.getTemperatures().entrySet()) {
        temperaturesOrder.add(temperature.getValue());
        }
        Collections.sort(temperaturesOrder);
        if (temperaturesOrder.size() %2 != 0) {
            median= temperaturesOrder.get(temperaturesOrder.size()/2);
        } else {
            median = temperaturesOrder.get((temperaturesOrder.size() + temperaturesOrder.size()-1)/2);
            }
        return median;
    }
}
