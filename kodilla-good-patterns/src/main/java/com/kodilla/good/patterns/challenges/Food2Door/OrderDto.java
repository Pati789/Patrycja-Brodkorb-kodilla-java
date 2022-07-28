package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderDto {

private String provider;
private boolean isAvailable;

public OrderDto(String provider, boolean isAvailable) {
    this.provider = provider;
    this.isAvailable = isAvailable;
}

    public String getProvider() {
        return provider;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
