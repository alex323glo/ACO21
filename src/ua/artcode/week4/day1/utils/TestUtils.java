package ua.artcode.week4.day1.utils;

public class TestUtils {

    public static final int TEST_BIG_ARRAY_SIZE = 1_000_000;
    public static final int TEST_MEDIUM_ARRAY_SIZE = 10_000;
    public static final int TEST_SMALL_ARRAY_SIZE = 100;

    public static int[] generateSortedIntArray(int length, int start, int step) {

        if (length < 1 || step < 0) {
            return null;
        }

        int[] testArray = new int[length];

        for (int i = 0; i < length; i++) {
            testArray[i] = start + step * i;
        }

        return testArray;

    }

    public static int[] generateUnsortedIntArray(int length, int left, int right) {

        if (length < 1 || left > right) {
            return null;
        }

        int[] testArray = new int[length];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * ((double) ((right - left) + left)));
        }

        return testArray;
    }

}
