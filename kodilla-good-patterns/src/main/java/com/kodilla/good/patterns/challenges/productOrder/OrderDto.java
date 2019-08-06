package com.kodilla.good.patterns.challenges.productOrder;

public class OrderDto {
    public String user;
    public boolean isOrdered;

    public OrderDto(String user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public String getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
