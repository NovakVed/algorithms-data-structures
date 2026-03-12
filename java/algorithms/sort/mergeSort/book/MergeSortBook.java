/**
 * MergeSortBook
 * Its a bit confusing, better check MergeSort
 */
class MergeSortBook {
    static void mergeSort(int A[], int l, int r) {
        if (l >= r) {
            return;
        }

        int m = (l + (r - 1)) / 2;
        mergeSort(A, l, m); // Arrays.copyOfRange(arr, l, mid); could have been used
        mergeSort(A, m + 1, r);

        merge(A, l, m, r);
    }

    static void merge(int[] A, int l, int m, int r) {
        int nl = m - l + 1;
        int nr = r - m;

        int[] L = new int[nl];
        int[] R = new int[nr];

        for (int i = 0; i < L.length; i++) {
            L[i] = A[l + i];
        }

        for (int j = 0; j < R.length; j++) {
            R[j] = A[m + j + 1];
        }

        int i = 0, j = 0, k = l;

        while (i < nl && j < nr) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < nl) {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < nr) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

    // A utility function to print array of size n
    static void printArray(int A[]) {
        int n = A.length;
        for (int i = 0; i < n; ++i)
            System.out.print(A[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
        int A[] = { 2, 4, 6, 7, 1, 2, 3, 5 };

        System.out.println("Given array is");
        printArray(A);

        mergeSort(A, 0, A.length - 1);

        System.out.println("\nSorted array is");
        printArray(A);
    }
}
