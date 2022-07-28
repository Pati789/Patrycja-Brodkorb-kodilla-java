package com.kodilla.good.patterns.challenges.Food2Door;

public interface Provider {
    String getProviderName();
    void process(OrderRequest order);
}
