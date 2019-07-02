package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    Flight haneda = new Flight("Londyn-Heathrow", "Haneda");
    public void findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<String, Boolean> routes = new HashMap<>();
        routes.put(haneda.getArrivalAirport(), true);

        boolean finder = routes.containsKey(flight.getArrivalAirport());

        if(finder==true) {
            System.out.println("Route: " + flight.getArrivalAirport() + ", has been found!");
        } else {
            throw new RouteNotFoundException();
        }

    }
}
