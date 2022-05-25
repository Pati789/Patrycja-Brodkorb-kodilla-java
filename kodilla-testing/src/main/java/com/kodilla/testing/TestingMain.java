package com.kodilla.testing;

import com.kodilla.testing.calculaor.Calculator;
import jdk.swing.interop.SwingInterOpUtils;

public class TestingMain {
    public static void main(String[] args) {
Calculator calculator = new Calculator();
        int result1 = Calculator.add(5, 5);
        if (result1==10) {
            System.out.println("test OK");
        } else {
    System.out.println("Error!");
}

        int result2 = Calculator.subtract(2, 7);
        if (result2==5) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }
}

