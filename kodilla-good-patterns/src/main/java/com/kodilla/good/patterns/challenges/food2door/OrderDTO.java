package com.kodilla.good.patterns.challenges.food2door;

public class OrderDTO {
    public String supplier;
    public boolean isOrdered;

    public OrderDTO(String supplier, boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public String getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
