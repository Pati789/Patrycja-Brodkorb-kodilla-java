package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRepository {

    public void createOrder(String provider, String product, int quantity){
        System.out.println("Order Repository saving... "+ "\n" + "Ordered product: "
                + product + "\n" + "Provider: "
                + provider + "\n" + "Quantity: : " + quantity);
    }
}
