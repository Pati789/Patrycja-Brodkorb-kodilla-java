package com.kodilla.good.patterns.challenges;

public class OrderDto {

    private Customer customer;
    private boolean isOrdered;

    private Seller seller;

    public OrderDto(Customer customer, boolean , Seller seller) {
        this.customer = customer;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public Seller getSeller() {
        return seller;
    }
}
