package com.kodilla.good.patterns.challenges.flightFinder;

import java.util.List;
import java.util.stream.Collectors;

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
    public void findFlyingThrough(String flyingFrom, String flyingTo) {
        System.out.println("Searching for flights...");
        List<String> resultFlyingStop;
        List<String> resultFlyingFromTime;
        int n = 0;
        resultFlyingStop = database.retrieveDatabase().stream()
                .filter(f -> f.getFlyingFrom().contains(flyingFrom))
                .map(f -> f.getFlyingTo())
                .collect(Collectors.toList());
        resultFlyingFromTime = database.retrieveDatabase().stream()
                .filter(f -> f.getFlyingFrom().contains(flyingFrom))
                .map(f -> f.getFlyingFromTime().toString())
                .collect(Collectors.toList());

        for (String instanceOfStop : resultFlyingStop) {
                database.retrieveDatabase().stream()
                        .filter(f -> f.getFlyingFrom().contains(instanceOfStop))
                        .filter(f -> f.getFlyingTo().contains(flyingTo))
                        .map(f -> "A flight has been found - " + flyingFrom + " at " + resultFlyingFromTime.get(n) + " through " + instanceOfStop + " at " + f.getFlyingFromTime()
                                + " to " + flyingTo + " at " + f.getFlyingToTime() + ".")
                        .forEach(System.out::println);
                resultFlyingFromTime.remove(n);
        }
    }
}

