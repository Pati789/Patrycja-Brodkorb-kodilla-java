package com.kodilla.good.patterns.challenges;

public class ShopApplication {

    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService(new InformationService(), new OrderService(), new OrderRepository());
        OrderRequest orderRequest = new OrderRequest(new Customer("Jan", "Kowalski", "jkowalski@gmail.com"), new Product("T-shirt"), new Seller("KNow", "Krzysztof", "Nowak"));
        productOrderService.process(orderRequest);

    }

}
