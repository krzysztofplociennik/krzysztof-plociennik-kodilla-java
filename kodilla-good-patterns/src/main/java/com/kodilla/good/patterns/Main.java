package com.kodilla.good.patterns;
import com.kodilla.good.patterns.challenges.MovieStore;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        MovieStore movieStoreObject = new MovieStore();

        movieStoreObject.getMovies().entrySet().stream()
                .map(t -> t.getValue())
                .flatMap(Collection::stream)
                .map(t -> t + "!")
                .forEach(t -> System.out.print(t));
    }
}
