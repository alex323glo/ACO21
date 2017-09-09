package ua.artcode.week3.day1.stat;

/**
 * Created by Alexey_O on 09.09.2017.
 */
public class TestStatic {

    public static void main(String[] args) {
        String res = "234234";

        int ran1 = StatContainer.count;
        int ran2 = StatContainer.random();

        int c = StatContainer.count;    // better than:
        //int c = new StatContainer().count;
    }

}
