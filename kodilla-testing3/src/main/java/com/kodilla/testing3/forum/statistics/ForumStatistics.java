package com.kodilla.testing3.forum.statistics;

public class ForumStatistics {

    private Statistics statistics;
    private int forumUserNumber;
    private int forumPostsNumber;
    private int forumCommentNumber;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public int getForumUserNumber() {
        return forumUserNumber;
    }

    public int getForumPostsNumber() {
        return forumPostsNumber;
    }

    public int getForumCommentNumber() {
        return forumCommentNumber;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        forumUserNumber = statistics.usersNames().size();
        forumCommentNumber = statistics.commentsCount();
        forumPostsNumber = statistics.postsCount();

        if (forumUserNumber == 0) {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
        } else {
            avgPostsPerUser = (double)forumPostsNumber / forumUserNumber;
            avgCommentsPerUser = (double)forumCommentNumber / forumUserNumber;
        }

        if (forumPostsNumber == 0) {
            avgCommentsPerPost = 0;
        } else {
            avgCommentsPerPost = (double)forumCommentNumber / forumPostsNumber;
        }
    }


    public void showStatistics() {
        System.out.println(
                "Users quantity: " + forumUserNumber + "\n" +
                        "Posts quantity: " + forumPostsNumber + "\n" +
                        "Comments quantity: " + forumCommentNumber + "\n" +
                        "An average  posts per user: " + avgPostsPerUser + "\n" +
                        "An average  comments per user: " + avgCommentsPerUser + "\n" +
                        "An average  comments per user post: " + avgCommentsPerPost + "\n"
        );
    }




}
