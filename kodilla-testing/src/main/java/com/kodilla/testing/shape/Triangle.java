package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName;
    private double base;
    private double altitude;

    public Triangle(String shapeName, double base, double altitude) {
        this.shapeName = shapeName;
        this.base = base;
        this.altitude = altitude;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return base*altitude/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.base, base) != 0) return false;
        if (Double.compare(triangle.altitude, altitude) != 0) return false;
        return shapeName.equals(triangle.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(base);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(altitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
