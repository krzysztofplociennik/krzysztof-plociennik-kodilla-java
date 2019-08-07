package com.kodilla.good.patterns.challenges.flightFinder;
import java.time.LocalTime;
import java.util.HashSet;

public class Database {

    public HashSet<Flight> retrieveDatabase() {
        HashSet<Flight> database = new HashSet<>();
        database.add(new Flight("Wrocław", LocalTime.of(12, 2),
                "Szczecin", LocalTime.of(16, 22),
                "Poznań"));
        database.add(new Flight("Rzeszów", LocalTime.of(9, 42),
                "Gdańsk", LocalTime.of(12, 50),
                "no stop"));
        database.add(new Flight("Szczecin", LocalTime.of(17, 38),
                "Bydgoszcz", LocalTime.of(19, 22),
                "no stop"));
        database.add(new Flight("Łódź", LocalTime.of(14, 44),
                "Szczecin", LocalTime.of(18, 19),
                "Poznań"));
        database.add(new Flight("Kraków", LocalTime.of(7, 30),
                "Warszawa", LocalTime.of(11, 4),
                "Łódź"));
        database.add(new Flight("Gdańsk", LocalTime.of(15, 51),
                "Katowice", LocalTime.of(21, 59),
                "Łódź"));
        database.add(new Flight("Zielona Góra", LocalTime.of(12, 2),
                "Warszawa", LocalTime.of(16, 22),
                "no stop"));
        database.add(new Flight("Warszawa", LocalTime.of(10, 10),
                "Szczecin", LocalTime.of(13, 22),
                "no stop"));
        database.add(new Flight("Łódź", LocalTime.of(19, 26),
                "Katowice", LocalTime.of(21, 1),
                "no stop"));
        database.add(new Flight("Bydgoszcz", LocalTime.of(13, 11),
                "Rzeszów", LocalTime.of(17, 31),
                "Łódź"));

        return database;
    }
}
