class MergeSort3 {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 2, 3, 1, 1, 0, 6, 7, 6, 9, 10 };
        mergeSort(arr, 0, arr.length - 1);
        for (int n : arr)
            System.out.printf("%d ", n);
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int m = l + (r - l) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);

        merge(arr, l, m, r);
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int nl = m - l + 1;
        int nr = r - m;

        int[] L = new int[nl];
        int[] R = new int[nr];

        for (int i = 0; i < L.length; i++) {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < R.length; j++) {
            R[j] = arr[m + j + 1];
        }

        int i = 0, j = 0, k = l; // k is used to keep track of current index of original array
        while (i < nl && j < nr) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < nl) {
            arr[k++] = L[i++];
        }

        while (j < nr) {
            arr[k++] = R[j++];
        }
    }
}
