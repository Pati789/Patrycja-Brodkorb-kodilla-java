package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User adam = new Millenials("Adam Nowak");
        User anna = new YGeneration("Anna Kowalska");
        User tomek = new ZGeneration("Tomasz Drozd");

        //When
        String adamShares = adam.sharePost();
        System.out.println("Adam shares posts on: " +adamShares);
        String annaShares = anna.sharePost();
        System.out.println("Anna shares posts on: " +annaShares);
        String tomekShares = tomek.sharePost();
        System.out.println("Tomasz shares posts on: " + tomekShares);

        //Then
        assertEquals("Snapchat", adamShares);
        assertEquals("Facebook", annaShares);
        assertEquals("Twitter", tomekShares);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User adam = new Millenials("Adam Nowak");

        //When
        String adamShares = adam.sharePost();
        System.out.println("Adam shares posts on: " + adamShares);
        adam.setSocialPublisher(new TwitterPublisher());
        adamShares = adam.sharePost();
        System.out.println("Now, Adam shares posts on: " + adamShares);

        //Then
        assertNotEquals("Snapchat", adamShares);
    }

}
