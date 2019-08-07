package com.kodilla.good.patterns;
import com.kodilla.good.patterns.challenges.MovieStore;
import com.kodilla.good.patterns.challenges.flightFinder.Database;
import com.kodilla.good.patterns.challenges.flightFinder.FlightFinder;
import com.kodilla.good.patterns.challenges.food2door.*;
import com.kodilla.good.patterns.challenges.food2door.OrderProcessor;
import com.kodilla.good.patterns.challenges.productOrder.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        /*MovieStore movieStoreObject = new MovieStore();

        movieStoreObject.getMovies().entrySet().stream()
                .map(t -> t.getValue())
                .flatMap(Collection::stream)
                .map(t -> t + "!")
                .forEach(t -> System.out.print(t));

        System.out.println("\n");

        RequestRetriever requestRetriever = new RequestRetriever();
        OrderRequest orderRequest = requestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new OrderRepository());
        orderProcessor.process(orderRequest);

        OrderInstance orderInstance1 = new OrderInstance("AVO121212", 200, 2300.00,
                "ExtraFoodShop", LocalDate.of(2019, 1, 19));
        OrderInstance orderInstance2 = new OrderInstance("APP6565", 400, 780.00,
                        "HealthyShop", LocalDate.of(2019, 1, 20));
        OrderInstance orderInstance3 = new OrderInstance("OR12314", 150, 660.00,
                "GlutenFreeShop", LocalDate.of(2019, 1, 21));

        OrderManager orderManager = new OrderManager();
        orderManager.addOrder(orderInstance1);
        orderManager.placeOrder(orderInstance1);
        orderManager.addOrder(orderInstance2);
        orderManager.placeOrder(orderInstance2);
        orderManager.addOrder(orderInstance3);
        orderManager.placeOrder(orderInstance3);

        OrderProcessor orderProcessor1 = new OrderProcessor(new ExtraFoodShopOrderService());
        orderProcessor1.processOrder(orderInstance1);
        OrderProcessor orderProcessor2 = new OrderProcessor(new HealthyShopOrderService());
        orderProcessor2.processOrder(orderInstance2);
        OrderProcessor orderProcessor3 = new OrderProcessor(new GlutenFreeShopOrderService());
        orderProcessor3.processOrder(orderInstance3);*/

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlyingFrom("Warszawa");
        flightFinder.findFlyingTo("Szczecin");
        flightFinder.findFlyingThrough("Łódź");
    }
}
