package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "ola", 'F', LocalDate.of(2010, 03, 04), 5));
        theForumUserList.add(new ForumUser(2, "ania", 'F', LocalDate.of(1994, 03, 04), 5));
        theForumUserList.add(new ForumUser(3, "alex", 'M', LocalDate.of(1994, 03, 04), 5));
        theForumUserList.add(new ForumUser(4, "nadia", 'F', LocalDate.of(1978, 03, 04), 0));
        theForumUserList.add(new ForumUser(5, "kasia", 'F', LocalDate.of(1988, 03, 04), 5));
        theForumUserList.add(new ForumUser(6,"tomek", 'M', LocalDate.of(1969,03,04), 5));
        theForumUserList.add(new ForumUser(7,"kamil", 'M', LocalDate.of(2001,03,04), 5));
        theForumUserList.add(new ForumUser(8,"staszek", 'M', LocalDate.of(2011,03,04), 0));
        theForumUserList.add(new ForumUser(9,"adam", 'M', LocalDate.of(2003,03,04), 5));
        theForumUserList.add(new ForumUser(10,"wojtek", 'M', LocalDate.of(2000,03,04), 5));
        theForumUserList.add(new ForumUser(11,"sebastian", 'M', LocalDate.of(2005,03,04), 5));
        theForumUserList.add(new ForumUser(12, "hania", 'F', LocalDate.of(1998,03,04), 5));
        theForumUserList.add(new ForumUser(13,"ala", 'F', LocalDate.of(1997,03,04), 5));
        theForumUserList.add(new ForumUser(14,"franek", 'M', LocalDate.of(2000,03,04), 5));
        theForumUserList.add(new ForumUser(15,"karol", 'M', LocalDate.of(1990,03,04), 0));
        theForumUserList.add(new ForumUser(16,"monia", 'F', LocalDate.of(1999,03,04), 5));
        theForumUserList.add(new ForumUser(17,"sandra", 'F', LocalDate.of(1997,03,04), 5));
        theForumUserList.add(new ForumUser(18,"znek", 'M', LocalDate.of(1987,03,04), 5));
        theForumUserList.add(new ForumUser(19,"asia", 'F', LocalDate.of(2013,03,04), 5));
        theForumUserList.add(new ForumUser(20,"piotrek", 'M', LocalDate.of(2014,03,04), 5));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }

}
