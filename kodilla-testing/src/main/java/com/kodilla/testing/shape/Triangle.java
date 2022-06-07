package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private String shapeName = "Triangle";
    private int a;
    private int h;
    private double field;

    @Override
    public String getShapeName() {
    this.shapeName = shapeName;
    return shapeName;
    }

    @Override
    public double getField() {
       field = a*h/2;
       return field;
    }
    public String toString() {
        return "TRIANGLE";

    }
}
