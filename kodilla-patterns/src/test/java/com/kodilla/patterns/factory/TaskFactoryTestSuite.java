package com.kodilla.patterns.factory;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryPaintingTask() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.makeShape(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();

        //Then
        assertEquals("Painting", paintingTask.getTaskName());
        assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.makeShape(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();

        //Then
        assertEquals("Shopping", shoppingTask.getTaskName());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.makeShape(TaskFactory.DRIVINGTASK   );
        drivingTask.executeTask();

        //Then
        assertEquals("Driving", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());
    }
}
