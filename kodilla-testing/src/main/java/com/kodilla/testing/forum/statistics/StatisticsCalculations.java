package com.kodilla.testing.forum.statistics;

public class StatisticsCalculations {
    Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double numberOfUsersInDouble;
    private double numberOfPostsInDouble;
    private double numberOfCommentsInDouble;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public StatisticsCalculations(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        numberOfUsersInDouble = (double)numberOfUsers;
        numberOfPostsInDouble = (double)numberOfPosts;
        numberOfCommentsInDouble = (double)numberOfComments;

        if(numberOfUsers!=0) {
            averageNumberOfPostsPerUser = numberOfPostsInDouble / numberOfUsersInDouble;
        } else { averageNumberOfPostsPerUser = 0; }
        if(numberOfUsers!=0) {
            averageNumberOfCommentsPerUser = numberOfCommentsInDouble / numberOfUsersInDouble;
        } else { averageNumberOfCommentsPerUser = 0; }
        if(numberOfPosts!=0) {
            averageNumberOfCommentsPerPost = numberOfCommentsInDouble / numberOfPostsInDouble;
        } else { averageNumberOfCommentsPerPost = 0; }
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public String showStatistics() {
        return "Number of users: " + getNumberOfUsers() +
                "\nNumber of posts: " + getNumberOfPosts() +
                "\nNumber of comments: " + getNumberOfComments() + "\n" +
                "\nNumber of posts per user: " + getAverageNumberOfPostsPerUser() +
                "\nNumber of comments per user: " + getAverageNumberOfCommentsPerUser() +
                "\nNumber of comments per post: " + getAverageNumberOfCommentsPerPost();
    }
}
