package com.kodilla.good.patterns.challenges.flightFinder;
import java.time.LocalTime;

public class Flight {
    private String flyingFrom;
    private LocalTime flyingFromTime;
    private String flyingTo;
    private LocalTime flyingToTime;
    private String flyingThrough;

    public Flight(String flyingFrom, LocalTime flyingFromTime, String flyingTo, LocalTime flyingToTime, String flyingThrough) {
        this.flyingFrom = flyingFrom;
        this.flyingFromTime = flyingFromTime;
        this.flyingTo = flyingTo;
        this.flyingToTime = flyingToTime;
        this.flyingThrough = flyingThrough;
    }

    public String getFlyingFrom() {
        return flyingFrom;
    }

    public LocalTime getFlyingFromTime() {
        return flyingFromTime;
    }

    public String getFlyingTo() {
        return flyingTo;
    }

    public LocalTime getFlyingToTime() {
        return flyingToTime;
    }

    public String getFlyingThrough() {
        return flyingThrough;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flyingFrom != null ? !flyingFrom.equals(flight.flyingFrom) : flight.flyingFrom != null) return false;
        if (flyingFromTime != null ? !flyingFromTime.equals(flight.flyingFromTime) : flight.flyingFromTime != null)
            return false;
        if (flyingTo != null ? !flyingTo.equals(flight.flyingTo) : flight.flyingTo != null) return false;
        if (flyingToTime != null ? !flyingToTime.equals(flight.flyingToTime) : flight.flyingToTime != null)
            return false;
        return flyingThrough != null ? flyingThrough.equals(flight.flyingThrough) : flight.flyingThrough == null;
    }

    @Override
    public int hashCode() {
        int result = flyingFrom != null ? flyingFrom.hashCode() : 0;
        result = 31 * result + (flyingFromTime != null ? flyingFromTime.hashCode() : 0);
        result = 31 * result + (flyingTo != null ? flyingTo.hashCode() : 0);
        result = 31 * result + (flyingToTime != null ? flyingToTime.hashCode() : 0);
        result = 31 * result + (flyingThrough != null ? flyingThrough.hashCode() : 0);
        return result;
    }
}
