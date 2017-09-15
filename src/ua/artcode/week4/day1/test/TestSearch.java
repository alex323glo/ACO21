package ua.artcode.week4.day1.test;

import ua.artcode.week4.day1.search.BinarySearch;
import ua.artcode.week4.day1.search.LineSearch;

import static ua.artcode.week4.day1.utils.TestUtils.TEST_BIG_ARRAY_SIZE;
import static ua.artcode.week4.day1.utils.TestUtils.generateSortedIntArray;

public class TestSearch {

    public static void main(String[] args) {

        int[] testArray = generateSortedIntArray(TEST_BIG_ARRAY_SIZE, TEST_BIG_ARRAY_SIZE / (-2), 1);

        LineSearch.indexOf(testArray, 0);
        BinarySearch.indexOf(testArray, 0);

        System.out.println("--------------------");

        LineSearch.indexOf(testArray, TEST_BIG_ARRAY_SIZE/ 2);
        BinarySearch.indexOf(testArray, TEST_BIG_ARRAY_SIZE / 2);

    }

}
