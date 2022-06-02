package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;                    // [2]
import org.junit.jupiter.api.Assertions;                       // [3]
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import java.util.*;
@DisplayName("OddNumberExterminator")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName(
            "When created ArrayList with numbers, " +
                    "then testOddNumbersExterminatorNormalList should return only odd numbers"
    )

@Test
     void testOddNumbersExterminatorNormalList()

    {
        //Given
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(8);
            list.add(9);

            ArrayList<Integer> expectedList = new ArrayList<>();
            expectedList.add(2);
            expectedList.add(4);
            expectedList.add(6);
            expectedList.add(8);

        //When
            OddNumberExterminator exterminator = new OddNumberExterminator();
            ArrayList<Integer> printList = exterminator.exterminate(list);
        //Then
            Assertions.assertEquals(expectedList, printList);
            System.out.println(printList);
    }
    @DisplayName(
            "When created empty ArrayList, " +
                    "then testOddNumbersExterminatorEmptyList should return an empty list"
    )
@Test
    void testOddNumbersExterminatorEmptyList()
    {
        //Given
            ArrayList<Integer> list = new ArrayList<>();
            OddNumberExterminator exterminator = new OddNumberExterminator();
            ArrayList<Integer> expectedList = new ArrayList<>();
        //When
            ArrayList<Integer> printList = exterminator.exterminate(list);

        //Then
            Assertions.assertEquals(expectedList, printList);
            System.out.println(printList);

}
}
