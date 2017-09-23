package ua.artcode.week6.day1.inner_nested;

import java.util.Arrays;
import java.util.Comparator;

public class InnerNestedClasses {

    public static void main(String[] args) {


        Integer[] arr1 = {34, 1, 4, 22, -4, 1};
        Integer[] arr2 = {5, 8, -19, 223, 12, -11, 0};

        // local inner class:
        class MyIntegerComparator implements Comparator<Integer> {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.intValue() - o2.intValue();
            }
        }

        Comparator comparator1 = new MyIntegerComparator();

        Arrays.sort(arr1, comparator1);



        // anonymous class:
        Comparator<Integer> comparator2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.intValue() - o2.intValue();
            }
        };

        Arrays.sort(arr2, comparator2);

    }

}
