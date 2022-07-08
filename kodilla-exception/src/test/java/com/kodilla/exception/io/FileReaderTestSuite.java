package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {


    @Test
    void WhenFileDoesntExistsReadFileShouldThrowException() {

        //Given
        FileReader fileReader = new FileReader();
        String fileName = "nie-ma-takiego-pliku.txt";

        //When & Then
        assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName));
}


}
