package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map (i-> numbers[i])
                .forEach(System.out::println);

        double average = IntStream.range(0, numbers.length)
                .map(i -> numbers [i])
                .average()
                .getAsDouble();
        System.out.println(average);
        return average;


    }
}
