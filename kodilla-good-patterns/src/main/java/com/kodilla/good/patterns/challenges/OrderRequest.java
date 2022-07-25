package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private Seller seller;
    private Customer customer;
    private Product product;

    public OrderRequest(Customer customer, Product , Seller seller) {
        this.customer = customer;
        this.product = product;
        this.seller = seller;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public Seller getSeller() {
        return seller;
    }
}
