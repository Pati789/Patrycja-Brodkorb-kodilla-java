package com.kodilla.testing.shape;

public class Circle  implements Shape{
    private String shapeName = "Circle";
    private int a;
    private int r;
    private double field;

    @Override
    public String getShapeName() {
        this.shapeName = shapeName;
        return shapeName;
    }

    @Override
    public double getField() {
        field = Math.PI*r*r;
        return field;
    }

    @Override
    public String toString() {
        return "CIRCLE";
    }
}
