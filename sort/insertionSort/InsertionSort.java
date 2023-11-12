package sort.insertionSort;

/*
 * Insertion Sort algorithm
 * Time Complexity O(n^2)
 * Space Complexity O(1) -> constant
 */
class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };

        insertionSort(arr);

        // Print solution
        for (int i : arr)
            System.out.println(i);
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
