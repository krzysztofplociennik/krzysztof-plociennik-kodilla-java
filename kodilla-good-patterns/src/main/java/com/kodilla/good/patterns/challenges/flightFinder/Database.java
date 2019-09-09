package com.kodilla.good.patterns.challenges.flightFinder;
import java.time.LocalTime;
import java.util.HashSet;

public class Database {

    public HashSet<Flight> retrieveDatabase() {
        HashSet<Flight> database = new HashSet<>();
        database.add(new Flight("Poznan", LocalTime.of(13, 42),
                "Rzeszow", LocalTime.of(16, 50),
                "Lodz"));
        database.add(new Flight("Wroclaw", LocalTime.of(12, 2),
                "Szczecin", LocalTime.of(16, 22),
                "Poznan"));
        database.add(new Flight("Rzeszow", LocalTime.of(9, 42),
                "Gdansk", LocalTime.of(12, 50),
                "no stop"));
        database.add(new Flight("Szczecin", LocalTime.of(7, 38),
                "Bydgoszcz", LocalTime.of(9, 22),
                "no stop"));
        database.add(new Flight("Lodz", LocalTime.of(14, 44),
                "Szczecin", LocalTime.of(18, 19),
                "Poznan"));
        database.add(new Flight("Krakow", LocalTime.of(7, 30),
                "Warszawa", LocalTime.of(11, 4),
                "Lodz"));
        database.add(new Flight("Gdansk", LocalTime.of(15, 51),
                "Katowice", LocalTime.of(21, 59),
                "Lodz"));
        database.add(new Flight("Szczecin", LocalTime.of(7, 18),
                "Lodz", LocalTime.of(9, 51),
                "no stop"));
        database.add(new Flight("Szczecin", LocalTime.of(11, 45),
                "Poznan", LocalTime.of(13, 1),
                "no stop"));
        database.add(new Flight("Zielona Gora", LocalTime.of(12, 2),
                "Warszawa", LocalTime.of(16, 22),
                "no stop"));
        database.add(new Flight("Warszawa", LocalTime.of(10, 10),
                "Szczecin", LocalTime.of(13, 22),
                "no stop"));
        database.add(new Flight("Lodz", LocalTime.of(19, 26),
                "Katowice", LocalTime.of(21, 1),
                "no stop"));
        database.add(new Flight("Bydgoszcz", LocalTime.of(10, 11),
                "Rzeszow", LocalTime.of(13, 31),
                "Lodz"));
        database.add(new Flight("Lodz", LocalTime.of(10, 29),
                "Rzeszow", LocalTime.of(12, 57),
                "no stop"));

        return database;
    }
}
