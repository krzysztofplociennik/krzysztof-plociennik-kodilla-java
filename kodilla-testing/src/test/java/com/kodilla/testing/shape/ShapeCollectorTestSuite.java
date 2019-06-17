package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Shape;
import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        //ArrayList<Shape> collectionOfShapes = new ArrayList<Shape>();
        ShapeCollector collectorObject = new ShapeCollector();

        //When
        collectorObject.addFigure(new Circle("c1", 3));

        //Then
        Assert.assertEquals(1, collectorObject.getSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        //ArrayList<Shape> collectionOfShapes = new ArrayList<Shape>();
        ShapeCollector collectorObject = new ShapeCollector();
        collectorObject.addFigure(new Circle("c1", 3));
        collectorObject.addFigure(new Circle("c2", 2));
        Shape c3 = new Circle("c3", 5);
        collectorObject.addFigure(c3);

        //When
        boolean result = collectorObject.removeFigure(c3);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(2, collectorObject.getSize());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collectorObject = new ShapeCollector();
        Shape c1 = new Circle("c1", 5);
        collectorObject.addFigure(c1);

        //When
        Shape currectShape;
        currectShape = collectorObject.getFigure(0);

        //Then
        Assert.assertEquals(c1, currectShape);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector collectorObject = new ShapeCollector();
        Shape c1 = new Circle("c1", 1);
        Shape c2 = new Circle("c2", 2);
        Shape c3 = new Circle("c3", 3);
        collectorObject.addFigure(c1);
        collectorObject.addFigure(c2);
        collectorObject.addFigure(c3);

        //When
        boolean contentsOfTheList = collectorObject.showFigures();

        //Then
        Assert.assertTrue(contentsOfTheList);
    }
}
