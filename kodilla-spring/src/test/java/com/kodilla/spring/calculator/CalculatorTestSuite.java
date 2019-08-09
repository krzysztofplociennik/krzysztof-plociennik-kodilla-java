package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(3, 5);
        double subResult = calculator.sub(5, 1);
        double mulResult = calculator.mul(4, 5);
        double divResult = calculator.div(10, 0);

        //Then
        Assert.assertEquals(8, addResult, 0.01);
        Assert.assertEquals(4, subResult, 0.01);
        Assert.assertEquals(20, mulResult, 0.01);
        Assert.assertEquals(0, divResult, 0.01);
    }
}
