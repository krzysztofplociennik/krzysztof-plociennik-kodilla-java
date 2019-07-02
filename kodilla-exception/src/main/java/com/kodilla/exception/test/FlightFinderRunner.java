package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        Flight haneda = new Flight("Londyn-Heathrow", "Haneda");

        try {
            flightFinder.findFlight(haneda);
        } catch (RouteNotFoundException e) {
            System.out.println("The route has not been found!");
        } finally {
            System.out.println("Search done!");
        }
    }
}