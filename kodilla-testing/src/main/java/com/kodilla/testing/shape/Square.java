package com.kodilla.testing.shape;

public class Square implements Shape{
    private String shapeName = "Square";
    int a;
    int field;

    @Override
    public String getShapeName() {
        this.shapeName = shapeName;
        return shapeName;
    }

    @Override
    public double getField() {
        field = a*a;
        return field;
    }

    public String toString() {
        return "SQUARE";
    }
}
