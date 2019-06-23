package com.kodilla.stream.forumUser;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theList = new ArrayList<>();

    public List<ForumUser> getUserList() {
        theList.add(new ForumUser(5654, "Ann", 'F', LocalDate.of(2000, 11, 6), 3));
        theList.add(new ForumUser(12321, "Peter", 'M', LocalDate.of(1990, 1, 16), 0));
        theList.add(new ForumUser(5776, "Matilda", 'F', LocalDate.of(2006, 4, 14), 32));
        theList.add(new ForumUser(5212, "Irene", 'F', LocalDate.of(2005, 7, 12), 9));
        theList.add(new ForumUser(19878, "Gustav", 'M', LocalDate.of(2000, 10, 22), 1));
        theList.add(new ForumUser(2034, "George", 'M', LocalDate.of(1995, 6, 30), 7));
        theList.add(new ForumUser(67878, "Alex", 'M', LocalDate.of(1997, 2, 2), 8));
        return new ArrayList<>(theList);
    }
}
