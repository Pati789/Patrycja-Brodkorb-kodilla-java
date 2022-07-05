package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite  {

    @Test
    void testGetAverage() {

        int [] array = new int[20];
        array [0] = 1;
        array [1] = 2;
        array [2] = 3;
        array [3] = 4;
        array [4] = 5;
        array [5] = 2;
        array [6] = 3;
        array [7] = 4;
        array [8] = 5;
        array [9] = 2;
        array [10] = 3;
        array [11] = 4;
        array [12] = 5;
        array [13] = 2;
        array [14] = 3;
        array [15] = 4;
        array [16] = 5;
        array [17] = 3;
        array [18] = 4;
        array [19] = 5;
        double result = ArrayOperations.getAverage(array);

        Assertions.assertEquals(3.45, result);



    }


}
