package insertionSort;

/*
 * Insertion Sort algorithm
 * Time Complexity O(n^2)
 * Space Complexity O(1) -> constant
 */
class InsertionSort {
    void main() {
        int[] A = { 5, 2, 4, 6, 1, 3 };

        insertionSort(A);

        // Solution
        for (int i : A)
            System.out.println(i);
    }

    static void insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;
        }
    }
}
