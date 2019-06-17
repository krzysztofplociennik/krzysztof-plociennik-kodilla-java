package com.kodilla.testing.shape;
import org.junit.*;

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
        ShapeCollector collectorObject = new ShapeCollector();
        //When
        collectorObject.addFigure(new Circle("c1", 3));
        //Then
        Assert.assertEquals(1, collectorObject.getSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
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
        Shape currentShape;
        currentShape = collectorObject.getFigure(0);
        //Then
        Assert.assertEquals(c1, currentShape);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector collectorObject = new ShapeCollector();
        Shape c1 = new Circle("Test circle", 1);
        Shape s1 = new Square("Test square", 1);
        Shape t1 = new Triangle("Test triange", 1, 1);
        collectorObject.addFigure(c1);
        collectorObject.addFigure(s1);
        collectorObject.addFigure(t1);
        //When
        boolean contentsOfTheList = collectorObject.showFigures();
        //Then
        Assert.assertTrue(contentsOfTheList);
    }
}
