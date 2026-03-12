/**
 * MergeSort
 * Really simple and using the concept of merge sort
 * Time Complexity O(n log n) or O(n lg n)
 * Space Complexity O(n) -> linear
 */
class MergeSort {

    // Driver code
    public static void main(String args[]) {
        int A[] = { 2, 4, 6, 7, 1, 2, 3, 5 };

        System.out.println("Given array is");
        printArray(A);

        mergeSort(A, A.length);

        System.out.println("\nSorted array is");
        printArray(A);
    }

    // A utility function to print array of size n
    static void printArray(int A[]) {
        int n = A.length;
        for (int i = 0; i < n; ++i)
            System.out.print(A[i] + " ");
        System.out.println();
    }

    static void mergeSort(int[] A, int n) {
        if (n < 2) {
            return;
        }

        int m = n / 2;
        int[] L = new int[m];
        int[] R = new int[n - m];

        for (int i = 0; i < L.length; i++) {
            L[i] = A[i];
        }

        for (int j = 0; j < R.length; j++) {
            R[j] = A[m + j];
        }

        mergeSort(L, m);
        mergeSort(R, m - n);

        merge(A, L, R, m, n - m);
    }

    static void merge(int[] A, int[] L, int[] R, int l, int r) {
        int i = 0, j = 0, k = 0;

        while (i < l && j < r) {
            if (L[i] <= R[j]) {
                A[k] = L[i++];
            } else {
                A[k] = R[j++];
            }
            k++;
        }

        while (i < l) {
            A[k++] = L[i++];
        }

        while (j < r) {
            A[k++] = R[j++];
        }
    }
}