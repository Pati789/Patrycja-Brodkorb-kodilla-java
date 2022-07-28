package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderService {
    public boolean order (final String provider, final String product, int quantity ) {
        System.out.println("Provider: " + provider + ", Ordered product:" + product + ", quantity: " + quantity );

    return true;
    }
}
