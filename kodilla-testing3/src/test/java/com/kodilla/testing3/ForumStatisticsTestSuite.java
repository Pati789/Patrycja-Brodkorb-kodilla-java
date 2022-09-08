package com.kodilla.testing3;

import com.kodilla.testing3.forum.statistics.ForumStatistics;
import com.kodilla.testing3.forum.statistics.Statistics;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    Statistics statisticsMock;
    private List<String> generateListOfUsers(int numberOfUsers) {
        List<String> listOfUsers = new ArrayList<>();

        for (int i = 0 ; i < numberOfUsers ; i++) {
            listOfUsers.add("User"+i);
        }

        return listOfUsers;
    }

    private int generateNumberOfPosts(int givenPosts) {
        int numberOfPosts = givenPosts;
        return numberOfPosts;
    }

    private int generateNumberOfComments(int givenComments) {
        int numberOfComments = givenComments;
        return numberOfComments;
    }

    @Nested
    class testsCalculateAdvStatistics {

        @Test
        void testWithZeroPosts() {

            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List <String> listOfUsers = generateListOfUsers(10);
            int postsNumber = generateNumberOfPosts(0);

            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(postsNumber);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(0, forumStatistics.getAvgPostsPerUser());
            assertEquals(0, forumStatistics.getAvgCommentsPerUser());
            assertEquals(0, forumStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testWith1000Posts() {

            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> listOfUsers = generateListOfUsers(10);
            int postsNumber = generateNumberOfPosts(1000);

            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(postsNumber);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(100.00, forumStatistics.getAvgPostsPerUser());
            assertEquals(0.00, forumStatistics.getAvgCommentsPerUser());
            assertEquals(0.00, forumStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testWith0Comments() {

            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> listOfUsers = generateListOfUsers(10);
            int postsNumber = generateNumberOfPosts(1000);
            int commentsNumber = generateNumberOfComments(0);

            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(postsNumber);
            when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(100.00, forumStatistics.getAvgPostsPerUser());
            assertEquals(0.00, forumStatistics.getAvgCommentsPerUser());
            assertEquals(0.00, forumStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testWithLessCommentsThanPosts() {

            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> listOfUsers = generateListOfUsers(10);
            int postsNumber = generateNumberOfPosts(20);
            int commentsNumber = generateNumberOfComments(10);

            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(postsNumber);
            when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(2.0, forumStatistics.getAvgPostsPerUser());
            assertEquals(1.0, forumStatistics.getAvgCommentsPerUser());
            assertEquals(0.5, forumStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testWithMoreCommentsThanPosts() {

            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> listOfUsers = generateListOfUsers(10);
            int postsNumber = generateNumberOfPosts(10);
            int commentsNumber = generateNumberOfComments(20);

            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(postsNumber);
            when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(1.0, forumStatistics.getAvgPostsPerUser());
            assertEquals(2.0, forumStatistics.getAvgCommentsPerUser());
            assertEquals(2.0, forumStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testWithZeroUsers() {

            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> listOfUsers = generateListOfUsers(0);

            when(statisticsMock.usersNames()).thenReturn(listOfUsers);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(0.0, forumStatistics.getAvgPostsPerUser());
            assertEquals(0.0, forumStatistics.getAvgCommentsPerUser());
            assertEquals(0.0, forumStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testWith100Users() {

            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> listOfUsers = generateListOfUsers(100);

            when(statisticsMock.usersNames()).thenReturn(listOfUsers);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(0.0, forumStatistics.getAvgPostsPerUser());
            assertEquals(0.0, forumStatistics.getAvgCommentsPerUser());
            assertEquals(0.0, forumStatistics.getAvgCommentsPerPost());
        }
    }
}
