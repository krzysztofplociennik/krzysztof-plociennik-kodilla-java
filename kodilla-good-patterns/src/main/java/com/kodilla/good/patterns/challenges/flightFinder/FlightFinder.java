package com.kodilla.good.patterns.challenges.flightFinder;

public class FlightFinder {
    Database database = new Database();

    public void findFlyingFrom(String flyingFrom) {
        System.out.println("Searching for flights...");
        database.retrieveDatabase().stream()
                .filter(f -> f.getFlyingFrom().contains(flyingFrom))
                .map(f -> "A flight has been found - " + f.getFlyingFrom() + " at: " + f.getFlyingFromTime()
                        + ", stop: " + f.getFlyingThrough() + ", arriving to: " + f.getFlyingTo() + " at: " + f.getFlyingToTime())
                .forEach(System.out::println);
    }
    public void findFlyingTo(String flyingTo) {
        System.out.println("Searching for flights...");
        database.retrieveDatabase().stream()
                .filter(f -> f.getFlyingTo().contains(flyingTo))
                .map(f -> "A flight has been found - " + f.getFlyingFrom() + " at: " + f.getFlyingFromTime()
                        + ", stop: " + f.getFlyingThrough() + ", arriving to: " + f.getFlyingTo() + " at: " + f.getFlyingToTime())
                .forEach(System.out::println);
    }
    public void findFlyingThrough(String flyingThrough) {
        System.out.println("Searching for flights...");
        database.retrieveDatabase().stream()
                .filter(f -> f.getFlyingThrough().contains(flyingThrough))
                .map(f -> "A flight has been found - " + f.getFlyingFrom() + " at: " + f.getFlyingFromTime()
                        + ", stop: " + f.getFlyingThrough() + ", arriving to: " + f.getFlyingTo() + " at: " + f.getFlyingToTime())
                .forEach(System.out::println);
    }
}
