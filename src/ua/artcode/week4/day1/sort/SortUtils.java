package ua.artcode.week4.day1.sort;

public class SortUtils {

    public static void bubbleSort(int[] array) {

        long timeStart = System.currentTimeMillis();

        if (array == null || array.length < 2) {
//            System.out.println(System.currentTimeMillis() - timeStart);
            return;
        }

        int buffer = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array.length; j++) {

                if (array[j] < array[j - 1]) {
                    swap(array, j - 1, j);
                }

            }

        }

//        System.out.println(System.currentTimeMillis() - timeStart);

    }

    public static void selectionSort(int[] array) {

        long timeStart = System.currentTimeMillis();

        if (array == null || array.length < 2) {
//            System.out.println(System.currentTimeMillis() - timeStart);
            return;
        }

        int maxIndex = 0;
        int buffer = 0;

        for (int i = 0; i < array.length; i++) {
            maxIndex = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex == i) {
                continue;
            }

            swap(array, i, maxIndex);
        }

//        System.out.println(System.currentTimeMillis() - timeStart);

    }

    private static void swap(int[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index1 >= array.length ||
                index2 < 0 || index2 >= array.length) {
            return;
        }

        int buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }

}
