package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class QueueOfTasksTestSuite {

    @Test
    public void testUpdate() {
        //Given
        QueueOfTasks student1 = new Student("Anna Nowak");
        QueueOfTasks student2 = new Student("Jan Kowalski");

        Mentor mentor1 = new Mentor("Krzysztof  Wiśniewski");
        Mentor mentor2 = new Mentor("Artur Kowalczyk ");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor2);

        //When
        student1.addTask("task1.1");
        student2.addTask("task2.1");
        student1.addTask("task1.2");
        student1.addTask("task1.4");
        student2.addTask("task2.2");
        student1.addTask("task1.3");
        student2.addTask("task2.3");

        //Then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(3, mentor2.getUpdateCount());





    }
}
