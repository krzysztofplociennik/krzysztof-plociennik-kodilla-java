package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getTheToDoList(), getTheInProgressList(), getTheDoneList());
    }

    @Bean
    public TaskList getTheToDoList() {
        return new TaskList();
    }

    @Bean
    public TaskList getTheInProgressList() {
        return new TaskList();
    }

    @Bean
    public TaskList getTheDoneList() {
        return new TaskList();
    }

}
