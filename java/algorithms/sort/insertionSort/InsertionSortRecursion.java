/**
 * InsertionSortRecursion
 */
class InsertionSortRecursion {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };

        insertionSort(arr, 1);

        // Print solution
        for (int i : arr)
            System.out.println(i);
    }

    static void insertionSort(int[] arr, int i) {
        if (i > arr.length - 1) {
            return;
        }
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;

        insertionSort(arr, ++i);
    }
}