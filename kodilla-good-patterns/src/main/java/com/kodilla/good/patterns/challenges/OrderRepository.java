package com.kodilla.good.patterns.challenges;

public class OrderRepository {

    public void createOrder(String name, String surname, String productName, String userName) {
        System.out.println("Order Repository saving... "+ "\n" + "Ordered product: " + productName + "\n" + "Seller: "+ userName + "\n" + "Customer: " + name + " " + surname);

    }
}
