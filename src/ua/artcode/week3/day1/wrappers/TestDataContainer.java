package ua.artcode.week3.day1.wrappers;

/**
 * Created by Alexey_O on 10.09.2017.
 */
public class TestDataContainer {

    public static void main(String[] args) {
        Object o = 5;   // Autobox example (int -> Integer)

        Integer a = 7;
        int b = a + 8;  // Unboxing example (Integer -> int)

        // One more utoboxing example:
        DataContainer dataContainer = new DataContainer(new Integer(42));



        // Wrapper's methods:
        int res = Integer.compare(23, 24);    // returns -1

        Integer convertedValue = Integer.getInteger("28");

        int value1 = Integer.parseInt("22");

        Integer value2 = Integer.valueOf(29);
        Integer value3 = Integer.valueOf("30");

        Integer integer1 = 58, integer2 = new Integer(58);
        int compareValue = integer1.compareTo(integer1);  // returns 0




        // What is faster?

        Integer counter1 = 0;
        long st1 = 0, st2 = 0;

        st1 = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            counter1++;
        }

        st2 = System.currentTimeMillis() - st1;

        System.out.println(st2 + " milliseconds.");


        Integer counter2 = 0;

        st1 = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            counter1++;
        }

        st2 = System.currentTimeMillis() - st1;

        System.out.println(st2 + " milliseconds.");


    }

}
