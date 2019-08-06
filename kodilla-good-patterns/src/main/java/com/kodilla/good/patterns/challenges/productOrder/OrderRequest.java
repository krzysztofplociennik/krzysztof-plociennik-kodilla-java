package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDate;

public class OrderRequest {
    private String productID;
    private LocalDate orderDate;
    private double price;
    private String user;

    public OrderRequest(final String productID, final LocalDate orderDate, final double price, final String user) {
        this.productID = productID;
        this.orderDate = orderDate;
        this.price = price;
        this.user = user;
    }

    public String getProductID() {
        return productID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getPrice() {
        return price;
    }

    public String getUser() {
        return user;
    }
}
