package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void openSettingsFile() {
        System.out.println("Creating a log...");
    }

    @AfterClass
    public static void closeSettingsFile() {
    }

    @Test
    public void testGetLastLog() {
        //Given
        String exampleLog = "10:00\tTests passed: 3";
        Logger.getInstance().log(exampleLog);
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(exampleLog, result);
    }
}
