package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Autowired
    Board board;

    @Bean
    public Board getBoard() { return new Board(new TaskList(), new TaskList(), new TaskList()); }

    @Bean
    public TaskList getTheToDoList() {
        return board.getToDoList();
    }

    @Bean
    public TaskList getTheInProgressList() {
        return board.getInProgressList();
    }

    @Bean
    public TaskList getTheDoneList() {
        return board.getDoneList();
    }
}
