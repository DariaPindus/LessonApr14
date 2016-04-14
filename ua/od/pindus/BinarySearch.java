package ua.od.pindus;

/**
 * Created by User on 14.04.2016.
 */
public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7, 8, 12};
        boolean result = search(array, 8, 0, array.length - 1);
        if (result) {
            System.out.println("Element is found.");
        } else {
            System.out.println("Element is absent.");
        }
    }

    public static boolean search(int[] arr, int value, int min, int max) {
        int mid = (min + max) / 2;

        if (arr[mid] == value) return true;

        if (min >= max) return false;

        if (arr[mid] > value) {
            boolean res = search(arr, value, min, mid - 1);
            return res;
        } else {
            boolean res = search(arr, value, mid + 1, max);
            return res;
        }
    }
}
