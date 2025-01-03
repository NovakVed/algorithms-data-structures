import java.util.Arrays;

public class MergeSort4 {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 3, 1, 7, 9 };
        mergeSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(n -> System.out.printf("%d ", n));
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l >= r)
            return;

        int m = l + (r - l) / 2;

        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int nl = m - l + 1;
        int nr = r - m;

        int[] leftArr = new int[nl];
        int[] rightArr = new int[nr];

        for (int i = 0; i < nl; i++)
            leftArr[i] = arr[i + l];

        for (int j = 0; j < nr; j++)
            rightArr[j] = arr[j + m + 1];

        int i = 0, j = 0, k = l;
        while (i < nl && j < nr) {
            if (leftArr[i] <= rightArr[j])
                arr[k++] = leftArr[i++];
            else
                arr[k++] = rightArr[j++];
        }

        while (i < nl) {
            arr[k++] = leftArr[i++];
        }

        while (j < nr) {
            arr[k++] = rightArr[j++];
        }
    }
}
