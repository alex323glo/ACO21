package ua.artcode.week6.day3.test;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class TestJ8 {

    public static void main(String[] args) {
        Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5, 6, 7);

        Consumer<Integer> cons = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer + " ");
            }
        };

        // peek() doesn't change stream !
        nums.peek(cons);
        nums.peek(new MyConsumer());



    }

    static class MyConsumer implements Consumer<Integer> {
        @Override
        public void accept(Integer integer) {
            System.out.println(integer + " ");
        }
    }


}
