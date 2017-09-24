package ua.artcode.week4.day_4_homework_1.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

    // TODO: TestDate

    public static void main(String[] args) {

//        testConstructors();

        testMethods();

    }

    private static void testConstructors() {
        Date date1 = new Date();
        Date date2 = new Date(0);
        Date date3 = new Date(3_600_000);
        System.out.println(date1 + "\n" + date2 + "\n" + date3);
    }

    private static void testMethods() {

        // after()
        Date date1 = new Date(3_600);
        Date date2 = new Date(7_200);
        System.out.println("date1: " + date1 + "\ndate2: " + date2);
        System.out.println(date1.after(date2) ? "date1 after date2" :
                date2.after(date1) ? "date2 after date1" : "date1 == date2");

        // before()
        System.out.println(date1.before(date2) ? "date1 before date2" :
                date2.before(date1) ? "date2 before date1" : "date1 is equal to date2");

        // compareTo()
        System.out.println("date1.compareTo(date2) = " + date1.compareTo(date2));   // can return -1, 0 or 1

        // getTime()
        System.out.println("date1: " + date1.getTime());

        // setTime()
        System.out.println("date2(before setTime(14_400)): " + date2.getTime());
        date2.setTime(14_400);
        System.out.println("date2(after setTime(14_400)): " + date2.getTime());

        // getting current date:
        System.out.println("Current date: " + new Date());
    }

    private void testSimpleDateFormat() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("GG, yyyy, MM, ");
    }

}
