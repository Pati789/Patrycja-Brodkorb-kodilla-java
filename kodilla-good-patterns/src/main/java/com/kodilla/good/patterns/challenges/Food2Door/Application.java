package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService(new InformationService(), new OrderService(), new OrderRepository());
        OrderRequest orderRequest = new OrderRequest("ExtraFoodShop", "cheese", 2);
        ProductOrderService.process(orderRequest);
    }
}
