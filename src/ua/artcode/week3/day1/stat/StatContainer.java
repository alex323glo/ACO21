package ua.artcode.week3.day1.stat;

/**
 * Created by Alexey_O on 09.09.2017.
 */
public class StatContainer {

    private int val;

    static {
        System.out.println("Before...");
    }

    public static int count = 10;

    static {
        // while class is loading
        int res = 234 * 12 - 234;
        count = res;
        System.out.println("...static block loads!");
    }

    public static int random() {
        return (int) (Math.random() * 100);
    }

    public void testNonStatic() {
        //
    }

}
