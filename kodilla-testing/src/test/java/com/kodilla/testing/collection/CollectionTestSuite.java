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

            OddNumberExterminator exterminator = new OddNumberExterminator();
            ArrayList<Integer> printList = exterminator.exterminate(list);

            System.out.println(printList);
    }
    @DisplayName(
            "When created empty ArrayList, " +
                    "then testOddNumbersExterminatorEmptyList should return an empty list"
    )
@Test
    void testOddNumbersExterminatorEmptyList()
{
    ArrayList<Integer> list = new ArrayList<>();

    OddNumberExterminator exterminator = new OddNumberExterminator();
    ArrayList<Integer> printList = exterminator.exterminate(list);

    System.out.println(printList);

}
}
