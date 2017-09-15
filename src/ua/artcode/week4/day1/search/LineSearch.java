package ua.artcode.week4.day1.search;

public class LineSearch {

    public static int indexOf(int[] arr, int key) {

        long timeStart = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(System.currentTimeMillis() - timeStart);
                return i;
            }
        }

        System.out.println(System.currentTimeMillis() - timeStart);

        return -1;

    }

}
