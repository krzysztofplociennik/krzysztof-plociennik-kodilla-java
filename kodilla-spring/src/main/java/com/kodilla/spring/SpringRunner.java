package com.kodilla.spring;
import com.kodilla.spring.portfolio.Board;
import com.kodilla.spring.portfolio.TaskList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringRunner.class, args);

        /*TaskList doObject = new TaskList();
        TaskList progressObject = new TaskList();
        TaskList doneObject = new TaskList();
        Board board = new Board(doObject, progressObject, doneObject);

        board.addToToDoList();
        board.addToInProgressList();
        board.addToInProgressList();
        board.addToDoneList();
        board.addToDoneList();
        board.addToDoneList();

        System.out.println(doObject.getTasks().size());
        System.out.println(progressObject.getTasks().size());
        System.out.println(doneObject.getTasks().size());

        for (String instance: doneObject.getTasks()) {
            System.out.println(instance);
        }*/



    }
}
