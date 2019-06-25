package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetListUsingIntStream() {
        //Given

        //When
        int[] numbers = {5, 1, 2, 4, 6, 8, 0, 3, 1, 4, 5, 2, 4, 9};

        //Then
        double result = ArrayOperations.getAverage(numbers);

        Assert.assertEquals(3.85, result, 0.01);
    }
}
