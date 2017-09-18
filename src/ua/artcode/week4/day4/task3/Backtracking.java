package ua.artcode.week4.day4.task3;

public class Backtracking {

    public static boolean groupSum(int start, int arr[], int target) {
        if (target == 0) {
            return true;
        }

        if (target < 0 || start >= arr.length) {
            return false;
        }

        return groupSum(start + 1, arr, target - arr[start]) ||
                groupSum(start + 1, arr, target);

    }

}
