package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> listOfShapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        listOfShapes.add(shape);
    }
    public void removeFigure(Shape shape) {
        listOfShapes.remove(shape);
    }
    public Shape getFigure(int n) {
        return listOfShapes.get(n);
    }
    public void showFigures() {
        System.out.println(listOfShapes);
    }
    public int getCollectionSize() {
        return listOfShapes.size();
    }
}
