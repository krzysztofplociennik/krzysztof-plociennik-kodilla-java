package com.kodilla.testing.loop;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoopTestSuite {

    @Test
    public void testLoopAndConditionalBreakpoints() {
        //Given
        long sum = 0;
        //When
        for(int n = 0; n < 1000; n++) {
            sum += n;
            System.out.println("[" + n + "] Sum equals: " + sum);
        }
        //Then
        assertEquals(499500, sum);

    }
}
