package ua.artcode.week4.day1.search;

public class BinarySearch {

    public static int indexOf(int[] arr, int key) {

        int start = 0;
        int end = arr.length - 1;
        int middle = end / 2;

        long timeStart = System.currentTimeMillis();

        while (start <= end) {
            middle = start + (end - start) / 2;
            if (arr[middle] == key) {
                System.out.println(System.currentTimeMillis() - timeStart);
                return middle;
            } else if (arr[middle] < key) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        System.out.println(System.currentTimeMillis() - timeStart);
        return -1;

    }

}
