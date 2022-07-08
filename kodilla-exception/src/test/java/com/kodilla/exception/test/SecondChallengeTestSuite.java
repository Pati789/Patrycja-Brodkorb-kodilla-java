package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {

@Test
    void probablyIWillThrowExceptionTest() {

    //Given
    SecondChallenge secondChallenge = new SecondChallenge();

    //When & Then
    assertDoesNotThrow(()-> secondChallenge.probablyIWillThrowException(1, 5));
    assertThrows(Exception.class, ()-> secondChallenge.probablyIWillThrowException(2, 1.5));
}

}
