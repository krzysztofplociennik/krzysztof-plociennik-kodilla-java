package com.kodilla.testing.collection;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Testing if it's empty...");
        Assert.assertEquals(numbers.size(), 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        OddNumbersExterminator oddExterminator = new OddNumbersExterminator();
        oddExterminator.exterminate(numbers, evenNumbers);
        int firstIndex = evenNumbers.get(0);
        int secondIndex = evenNumbers.get(1);
        System.out.println("Testing the method...");
        Assert.assertEquals(firstIndex, 2);
        Assert.assertEquals(secondIndex, 4);
    }
}
