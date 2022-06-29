package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    public final int id;
    public final String name;
    public final char sex;
    public final LocalDate dateOfBirth;
    public final int numberOfPosts ;

    public ForumUser(int id, String name, char sex, LocalDate dateOfBirth, int numberOfPosts) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }
    @Override
    public String toString() {
        return "User{" +
                "name: '" + name + '\'' +
                ", sex: '" + sex + '\'' +
                ", date of birth: " + dateOfBirth + ", number of posts=" + numberOfPosts +
                 '}';
    }

}
