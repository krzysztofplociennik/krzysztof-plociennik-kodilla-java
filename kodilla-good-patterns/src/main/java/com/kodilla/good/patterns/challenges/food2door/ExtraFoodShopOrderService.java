package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;

public class ExtraFoodShopOrderService implements ShopOrderService {

    public boolean process(final String productID, final int amount, final double totalPrice,
                         final String supplier, final LocalDate dateOfOrder) {
        System.out.println("Ordering " + amount + " times amount of " + productID + " for a total price of: "
                + totalPrice + " from " + supplier + ", " + dateOfOrder.toString() + ".");
        return true;
    }
}
