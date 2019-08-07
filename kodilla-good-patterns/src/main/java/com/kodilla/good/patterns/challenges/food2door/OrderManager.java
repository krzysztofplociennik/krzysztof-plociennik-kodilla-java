package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    ArrayList<OrderInstance> listOfOrders = new ArrayList<>();

    public void addOrder(OrderInstance orderInstance) {
        listOfOrders.add(orderInstance);
    }

    public OrderInstance placeOrder(OrderInstance orderInstance) {
            return orderInstance;
    }
}

