package ua.artcode.week4.day1.test;

import ua.artcode.week4.day1.utils.time.ITimeAction;
import ua.artcode.week4.day1.utils.time.TimeCounter;

public class TestStringBuilder {

    public static void main(String[] args) {

        System.out.println(TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                String res = "";
                for (int i = 0; i < 100_000; i++) {
                    res += i;
                }
            }
        }));

        System.out.println(TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                StringBuilder res = new StringBuilder("");
                for (int i = 0; i < 100_000; i++) {
                    res.append(i);
                }
            }
        }));


    }

}
