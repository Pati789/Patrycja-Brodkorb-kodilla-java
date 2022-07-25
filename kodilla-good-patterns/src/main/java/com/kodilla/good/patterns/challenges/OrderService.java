package com.kodilla.good.patterns.challenges;

public class OrderService {

    public boolean bought(final Customer customer, final Product product, final Seller seller) {
        System.out.println("Ordered product" + product.getProductName() + "seller: "
                + seller.getUsername() + seller.getName()+ seller.getSurname() + " , customer: "
                + customer.getName()+ customer.getSurname());
        return true;
    }

}
