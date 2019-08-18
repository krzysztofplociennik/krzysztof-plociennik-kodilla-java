package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVE = "DRIVE";
    public static final String PAINT = "PAINT";
    public static final String SHOP = "SHOP";

    public final Task executeTask(final String task) {
        switch (task) {
            case DRIVE:
                return new DrivingTask("Driving to Mall", "The Mall", "Car");
            case PAINT:
                return new PaintingTask("Painting a shape", "White", "Circle");
            case SHOP:
                return new ShoppingTask("Getting new brushes", "Brushes", 3);
            default:
                return null;
        }
    }
}
