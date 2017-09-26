package ua.artcode.week7.day1.test;

import ua.artcode.week7.day1.model.User;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {
        Set<User> userSet = new HashSet<>();    // default: initialCapacity = 16, loadFactor = 0.75

        Date birth = new Date();
        userSet.add(new User(1, 2000, "Ivan", birth));
        userSet.add(new User(1, 2000, "Ivan", birth));
        userSet.add(new User(1, 2000, "Ivan", birth));
        userSet.add(new User(1, 2000, "Ivan", birth));

        System.out.println(userSet.size()); // will return 1 (instead of 4) !

    }

}
