package algorithms.sort.bubbleSort.practice;

import java.util.Arrays;

public class BubbleSort2 {
    public void main(String[] args) {
        int[] arr = new int[] { 3, 6, 7, 8, 1, 2, 3, 1, 9, 0, 2 };
        bubbleSort(arr);
        Arrays.stream(arr).forEach((num) -> {
            System.out.print(num + " ");
        });
    }

    private void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    arr[j - 1] = arr[j - 1] ^ arr[j];
                    arr[j] = arr[j - 1] ^ arr[j];
                    arr[j - 1] = arr[j - 1] ^ arr[j];
                }
            }
        }
    }
}