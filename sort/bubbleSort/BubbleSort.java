package sort.bubbleSort;

/**
 * BubbleSort
 */
class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };

        bubbleSort(arr);

        // Print solution
        for (int i : arr)
            System.out.println(i);
    }

    static void bubbleSort(int[] arr) {
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