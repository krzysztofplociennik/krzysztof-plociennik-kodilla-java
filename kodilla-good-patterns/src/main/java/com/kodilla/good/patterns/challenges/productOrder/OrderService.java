package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDate;

public interface OrderService {

    boolean order(final String productID, final LocalDate orderDate, final double price, final String user);
}
