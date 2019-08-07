package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;

public class OrderInstance {
    private String productID;
    private int amount;
    private double totalPrice;
    private String supplier;
    private LocalDate dateOfOrder;

    public OrderInstance(String productID, int amount, double totalPrice, String supplier, LocalDate dateOfOrder) {
        this.productID = productID;
        this.amount = amount;
        this.totalPrice = totalPrice;
        this.supplier = supplier;
        this.dateOfOrder = dateOfOrder;
    }

    public String getProductID() {
        return productID;
    }

    public int getAmount() {
        return amount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getSupplier() {
        return supplier;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }
}
