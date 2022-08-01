package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;


    @Test
    void getLastLogTest() {
        //Given
        logger = Logger.INSTANCE;
        logger.log("new log");
        //When
        String lastLog = logger.getLastLog();
        System.out.println("Last log: " + lastLog);

        //Then
        assertEquals("new log", lastLog);

    }
}
