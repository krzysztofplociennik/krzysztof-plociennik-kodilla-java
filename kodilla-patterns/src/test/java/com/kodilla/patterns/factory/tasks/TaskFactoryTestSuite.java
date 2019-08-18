package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.executeTask(TaskFactory.DRIVE);
        //Then
        Assert.assertEquals("Executing the task: driving!", driving.executeTask());
        Assert.assertEquals("Driving to Mall", driving.getTaskName());
        Assert.assertEquals(false, driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.executeTask(TaskFactory.PAINT);
        //Then
        Assert.assertEquals("Executing the task: painting!", painting.executeTask());
        Assert.assertEquals("Painting a shape", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.executeTask(TaskFactory.SHOP);
        //Then
        Assert.assertEquals("Executing the task: shopping!", shopping.executeTask());
        Assert.assertEquals("Getting new brushes", shopping.getTaskName());
        Assert.assertEquals(false, shopping.isTaskExecuted());
    }
}
