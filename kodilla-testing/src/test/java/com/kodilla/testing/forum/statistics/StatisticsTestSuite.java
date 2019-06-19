package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsWithMock1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfUsers = new ArrayList<>();
        for(int i=0; i<7; i++){
            listOfUsers.add(".");
        }
        int posts = 0;
        int comments = 15;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        StatisticsCalculations calculationsObject = new StatisticsCalculations(statisticsMock);

        //When
        calculationsObject.calculateAdvStatistics(statisticsMock);
        double avPostsPerUser = calculationsObject.getAverageNumberOfPostsPerUser();
        double avCommentsPerUser = calculationsObject.getAverageNumberOfCommentsPerUser();
        double avCommentsPerPost = calculationsObject.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(0, avPostsPerUser, 0.01);
        Assert.assertEquals(2.14, avCommentsPerUser, 0.01);
        Assert.assertEquals(0, avCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfUsers = new ArrayList<>();
        for(int i=0; i<7; i++){
            listOfUsers.add(".");
        }
        int posts = 1000;
        int comments = 16;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        StatisticsCalculations calculationsObject = new StatisticsCalculations(statisticsMock);

        //When
        calculationsObject.calculateAdvStatistics(statisticsMock);
        double avPostsPerUser = calculationsObject.getAverageNumberOfPostsPerUser();
        double avCommentsPerUser = calculationsObject.getAverageNumberOfCommentsPerUser();
        double avCommentsPerPost = calculationsObject.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(142.85, avPostsPerUser, 0.01);
        Assert.assertEquals(2.28, avCommentsPerUser, 0.01);
        Assert.assertEquals(0.016, avCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfUsers = new ArrayList<>();
        for(int i=0; i<9; i++){
            listOfUsers.add(".");
        }
        int posts = 12;
        int comments = 0;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        StatisticsCalculations calculationsObject = new StatisticsCalculations(statisticsMock);

        //When
        calculationsObject.calculateAdvStatistics(statisticsMock);
        double avPostsPerUser = calculationsObject.getAverageNumberOfPostsPerUser();
        double avCommentsPerUser = calculationsObject.getAverageNumberOfCommentsPerUser();
        double avCommentsPerPost = calculationsObject.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(1.33, avPostsPerUser, 0.01);
        Assert.assertEquals(0, avCommentsPerUser, 0.01);
        Assert.assertEquals(0, avCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfUsers = new ArrayList<>();
        for(int i=0; i<14; i++){
            listOfUsers.add(".");
        }
        int posts = 12;
        int comments = 10;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        StatisticsCalculations calculationsObject = new StatisticsCalculations(statisticsMock);

        //When
        calculationsObject.calculateAdvStatistics(statisticsMock);
        double avPostsPerUser = calculationsObject.getAverageNumberOfPostsPerUser();
        double avCommentsPerUser = calculationsObject.getAverageNumberOfCommentsPerUser();
        double avCommentsPerPost = calculationsObject.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(0.85, avPostsPerUser, 0.01);
        Assert.assertEquals(0.71, avCommentsPerUser, 0.01);
        Assert.assertEquals(0.83, avCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfUsers = new ArrayList<>();
        for(int i=0; i<7; i++){
            listOfUsers.add(".");
        }
        int posts = 12;
        int comments = 27;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        StatisticsCalculations calculationsObject = new StatisticsCalculations(statisticsMock);

        //When
        calculationsObject.calculateAdvStatistics(statisticsMock);
        double avPostsPerUser = calculationsObject.getAverageNumberOfPostsPerUser();
        double avCommentsPerUser = calculationsObject.getAverageNumberOfCommentsPerUser();
        double avCommentsPerPost = calculationsObject.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(1.71, avPostsPerUser, 0.01);
        Assert.assertEquals(3.85, avCommentsPerUser, 0.01);
        Assert.assertEquals(2.25, avCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfUsers = new ArrayList<>();
        int posts = 5;
        int comments = 10;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        StatisticsCalculations calculationsObject = new StatisticsCalculations(statisticsMock);

        //When
        calculationsObject.calculateAdvStatistics(statisticsMock);
        double avPostsPerUser = calculationsObject.getAverageNumberOfPostsPerUser();
        double avCommentsPerUser = calculationsObject.getAverageNumberOfCommentsPerUser();
        double avCommentsPerPost = calculationsObject.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(0, avPostsPerUser, 0.01);
        Assert.assertEquals(0, avCommentsPerUser, 0.01);
        Assert.assertEquals(2, avCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock7() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfUsers = new ArrayList<>();
        for(int i=0; i<100; i++){
            listOfUsers.add(".");
        }
        int posts = 12;
        int comments = 23;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        StatisticsCalculations calculationsObject = new StatisticsCalculations(statisticsMock);

        //When
        calculationsObject.calculateAdvStatistics(statisticsMock);
        double avPostsPerUser = calculationsObject.getAverageNumberOfPostsPerUser();
        double avCommentsPerUser = calculationsObject.getAverageNumberOfCommentsPerUser();
        double avCommentsPerPost = calculationsObject.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(0.12, avPostsPerUser, 0.01);
        Assert.assertEquals(0.23, avCommentsPerUser, 0.01);
        Assert.assertEquals(1.91, avCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock8() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfUsers = new ArrayList<>();
        for(int i=0; i<10; i++){
            listOfUsers.add(".");
        }
        int posts = 15;
        int comments = 18;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        StatisticsCalculations calculationsObject = new StatisticsCalculations(statisticsMock);

        //When
        calculationsObject.calculateAdvStatistics(statisticsMock);
        String result = calculationsObject.showStatistics();

        //Then
        Assert.assertEquals("Number of users: 10" + "\nNumber of posts: 15" + "\nNumber of comments: 18" + "\n\n" +
                "Number of posts per user: 1.5" + "\nNumber of comments per user: 1.8" + "\nNumber of comments per post: 1.2", result);
    }
}
