package ua.artcode.week4.day1.utils.time;

public class TimeCounter {

    public static long count(ITimeAction action) {

        long start = System.currentTimeMillis();
        action.doAction();
        long end = System.currentTimeMillis();

        return end - start;
    }

}
