package insertionSort;

/**
 * InsertionSortDecreasingOrder
 * Value arr = { 5, 2, 4, 6, 1, 3 }
 * Instead of sorted as [1, 2, 3, 4, 5, 6]
 * Sort it in decreasing order as [6, 5, 4, 3, 2, 1]
 */
public class InsertionSortDecreasingOrder {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 2, 4, 6, 1, 3 };

        insertionSortDecreasingOrder(arr);

        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    static void insertionSortDecreasingOrder(int[] arr) {
        for (int i = arr.length - 1; i > 1; i--) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}