package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDate;

public class RequestRetriever {

    public OrderRequest retrieve() {

        String product1 = "AV09045";
        LocalDate date1 = LocalDate.of(2019, 11, 30);
        double price1 = 39.99;
        String user1 = "mattcol";

        return new OrderRequest(product1, date1, price1, user1);
    }
}