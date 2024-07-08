import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 64, 25, 12, 22, 11, 4, 6, 1, 2, 591, 213, 29 };
        mergeSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::println);
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

        for (int i = 0; i < nl; i++) {
            L[i] = arr[l + i];
        }

        for (int i = 0; i < nr; i++) {
            R[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0, k = l;
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
