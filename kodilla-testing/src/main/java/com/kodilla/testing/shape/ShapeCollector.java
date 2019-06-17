package com.kodilla.testing.shape;
import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> collectionOfShapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        collectionOfShapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (collectionOfShapes.contains(shape)){
            collectionOfShapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < collectionOfShapes.size()) {
            shape = collectionOfShapes.get(n);
        }
        return shape;
    }

    public boolean showFigures() {
        if(collectionOfShapes.size()>0) {
            for (Shape inst : collectionOfShapes) {
                System.out.println(inst.getShapeName() + " = " + inst.getField());
            }
            return true;
        } else return false;
    }

    public int getSize(){
        return collectionOfShapes.size();
    }
}
