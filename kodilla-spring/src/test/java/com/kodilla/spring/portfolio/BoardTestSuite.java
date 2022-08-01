package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("new task to do");
        board.getInProgressList().getTasks().add("new in progress task");
        board.getDoneList().getTasks().add("new task done");
        String toDo1 = board.getToDoList().getTasks().get(0);
        String inProgress1 = board.getInProgressList().getTasks().get(0);
        String done1 = board.getDoneList().getTasks().get(0);

        //Then
        assertEquals(toDo1,"new task to do" );
        assertEquals(inProgress1, "new in progress task");
        assertEquals(done1,"new task done");
    }
}
