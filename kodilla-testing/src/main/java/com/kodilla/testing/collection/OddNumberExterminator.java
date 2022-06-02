package com.kodilla.testing.collection;

import java.util.*;

public class OddNumberExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers)
    {
        int tempNumber;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i= 0; i< numbers.size(); i++) {
            tempNumber = numbers.get(i)%2;
            if (tempNumber ==0 ) {
                result.add(numbers.get(i));
            }
        }
        return result;
    }
}
