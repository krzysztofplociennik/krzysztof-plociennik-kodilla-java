package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;

public interface ShopOrderService {
    boolean process(final String productID, final int amount, final double totalPrice,
                  final String supplier, final LocalDate dateOfOrder);
}
