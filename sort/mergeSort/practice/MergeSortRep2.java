package sort.mergeSort.practice;

import java.util.Arrays;

public class MergeSortRep2 {
    public static void main(String[] args) {
        int[] unsortedArray = new int[] { 2, 4, 6, 7, 1, 2, 3, 5 };
        mergeSort(unsortedArray);

        System.out.print("[");
        Arrays.stream(unsortedArray).forEach(s -> System.out.print(s + ", "));
        System.out.println("]");
    }

    static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        int middleIndex = arr.length / 2;
        int[] leftArr = new int[middleIndex];
        int[] rightArr = new int[arr.length - middleIndex];

        for (int i = 0; i < rightArr.length; i++) {
            leftArr[i] = arr[i];
        }

        for (int j = 0; j < rightArr.length; j++) {
            rightArr[j] = arr[middleIndex + j];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(arr, leftArr, rightArr);
    }

    static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int i = 0, j = 0, k = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i++];
            } else {
                arr[k] = rightArr[j++];
            }
            k++;
        }

        while (i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }

        while (j < rightArr.length) {
            arr[k++] = rightArr[j++];
        }
    }
}
