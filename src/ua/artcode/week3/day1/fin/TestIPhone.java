package ua.artcode.week3.day1.fin;

/**
 * Created by Alexey_O on 09.09.2017.
 */
public class TestIPhone {

    public static void main(String[] args) {
        // Example of code without "side effect":
        final int key = 234;

        int keyCopy = key;

        //key = 34;   // can't do so!!!

        IPhone iPhone = new IPhone();

        iPhone.getAccount().setName("Alex");    // not restricted (even when the account member is final) !!!
    }

}
