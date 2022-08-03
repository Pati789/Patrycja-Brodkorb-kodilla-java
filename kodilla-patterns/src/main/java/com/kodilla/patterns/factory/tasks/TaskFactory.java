package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeShape(final String shapeClass) {
        switch (shapeClass) {
            case PAINTINGTASK:
                return new PaintingTask("Painting", "blue", "bedroom");
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping", "milk", 5);
            case DRIVINGTASK:
                return new DrivingTask("Driving", "shoppingcentre", "car" );
            default:
                return null;
        }
    }


}
