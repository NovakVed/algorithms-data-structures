package mergeSort.practice;

/**
 * PracticeMergeSort
 * Practicing merge sort!
 */
class PracticeMergeSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 6, 8, 1, 2, 5, 7, 9, 2 };
        printArray(arr);

        mergeSort(arr);

        System.out.println("\nSorted array: ");
        printArray(arr);
    }

    private static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        int middleIndex = arr.length / 2;

        int[] leftArr = new int[middleIndex];
        int[] rightArr = new int[arr.length - middleIndex];
        for (int i = 0; i < middleIndex; i++) {
            leftArr[i] = arr[i];
        }

        for (int j = 0; j < rightArr.length; j++) {
            rightArr[j] = arr[j + middleIndex];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(arr, leftArr, rightArr);
    }

    static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int i = 0, j = 0, k = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
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

    static void printArray(int[] arr) {
        System.out.print("Array: [");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]\n");
                break;
            }
            System.out.print(arr[i] + ", ");
        }
    }
}
