package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDate;

public class ProductOrderService implements OrderService{

    public boolean order(final String productID, final LocalDate orderDate, final double price, final String user) {
        System.out.println("Ordering " + productID + " for " + price + ", from user: " + user + ", (" + orderDate.toString() + ").");
        return true;
    }
}
