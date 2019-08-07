package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;

public class GlutenFreeShopOrderService implements ShopOrderService{

    public boolean process(final String productID, final int amount, final double totalPrice,
                           final String supplier, final LocalDate dateOfOrder) {
        System.out.println(dateOfOrder.toString() + ", " + supplier + ", " + productID + ", " + amount + ", " + totalPrice + ".");
        return true;
    }
}
