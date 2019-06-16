package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {

    public void exterminate(ArrayList<Integer> numbers, ArrayList<Integer> evenNumbers) {
        for(Integer instance: numbers) {
            if(instance%2==0) {
                evenNumbers.add(instance);
            }
        }
    }
}