package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDate;

public interface Repository {

    void createRepository(String productID, LocalDate orderDate, double price, String user);
}
