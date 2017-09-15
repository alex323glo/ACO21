package ua.artcode.week4.day1.test;

import ua.artcode.week4.day1.sort.SortUtils;
import ua.artcode.week4.day1.utils.TestUtils;
import ua.artcode.week4.day1.utils.time.ITimeAction;
import ua.artcode.week4.day1.utils.time.TimeCounter;

import java.util.Arrays;

public class TestSort {

    public static void main(String[] args) {

        int[] testArray1 = TestUtils.generateUnsortedIntArray(TestUtils.TEST_MEDIUM_ARRAY_SIZE,
                TestUtils.TEST_MEDIUM_ARRAY_SIZE / (-2),
                TestUtils.TEST_MEDIUM_ARRAY_SIZE / 2);

        int[] testArray2 = Arrays.copyOf(testArray1, testArray1.length);
        int[] testArray3 = Arrays.copyOf(testArray1, testArray1.length);

//        SortUtils.bubbleSort(testArray1);
//        SortUtils.selectionSort(testArray2);


        System.out.println(TimeCounter.count(new BubbleSortTimeAction(testArray1)));
        System.out.println(TimeCounter.count(new SelectionSortTimeAction(testArray2)));
        System.out.println(TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                Arrays.sort(testArray3);
            }
        }));

    }

}

class BubbleSortTimeAction implements ITimeAction {

    private int[] arr;

    public BubbleSortTimeAction(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void doAction() {
        SortUtils.bubbleSort(arr);
    }
}

class SelectionSortTimeAction implements ITimeAction {

    private int[] arr;

    public SelectionSortTimeAction(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void doAction() {
        SortUtils.selectionSort(arr);
    }
}
