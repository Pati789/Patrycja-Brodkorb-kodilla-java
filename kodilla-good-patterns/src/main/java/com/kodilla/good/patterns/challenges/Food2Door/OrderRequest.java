package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRequest {

    private final String provider;
    private final String product;

    private int quantity;

    public OrderRequest(final String provider, final String product, int quantity) {
        this.provider = provider;
        this.product = product;
        this.quantity = quantity;
    }

    public String getProvider() {
        return provider;
    }

    public String getProduct() {

        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
