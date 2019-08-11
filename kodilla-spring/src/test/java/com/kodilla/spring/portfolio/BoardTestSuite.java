package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String exampleToDo = "somethingToDo";
        String exampleInProgress = "somethingInProgress";
        String exampleDone = "somethingDone";
        board.getToDoList().getTasks().add(exampleToDo);
        board.getInProgressList().getTasks().add(exampleInProgress);
        board.getInProgressList().getTasks().add(exampleInProgress);
        board.getDoneList().getTasks().add(exampleDone);
        board.getDoneList().getTasks().add(exampleDone);
        board.getDoneList().getTasks().add(exampleDone);
        //Then
        Assert.assertEquals("somethingToDo", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("somethingInProgress", board.getInProgressList().getTasks().get(1));
        Assert.assertEquals("somethingDone", board.getDoneList().getTasks().get(2));
        Assert.assertEquals(1, board.getToDoList().getTasks().size());
        Assert.assertEquals(2, board.getInProgressList().getTasks().size());
        Assert.assertEquals(3, board.getDoneList().getTasks().size());
    }
}
