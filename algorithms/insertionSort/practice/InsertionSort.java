package practice;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 7, 3, 324, 12, 5, 8, 23, 0, 2312, 23, 8 };
        insertionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[i--] = arr[j--];
            }

            arr[j + 1] = key;
        }
    }
}
