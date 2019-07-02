package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    public void exceptionHandler() {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1, 7);
        } catch (Exception e) {
            System.out.println("Bad number!");
        } finally {
            System.out.println("Ok!");
        }
    }
}
