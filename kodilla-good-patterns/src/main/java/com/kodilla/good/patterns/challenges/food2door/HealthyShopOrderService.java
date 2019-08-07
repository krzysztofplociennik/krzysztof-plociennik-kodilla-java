package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;

public class HealthyShopOrderService implements ShopOrderService {

    public boolean process(final String productID, final int amount, final double totalPrice,
                         final String supplier, final LocalDate dateOfOrder) {
        System.out.println("Order: " + productID + ", quantity: " + amount + ", cost: "
                + totalPrice + ", from: " + supplier + ", date of order:" + dateOfOrder.toString() + ".");
        return true;
    }
}
