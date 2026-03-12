import java.util.Arrays;;

class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 5, 6, 2, 1, 6, 8, 0, 1 };
        quickSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int pivot = partition(arr, l, r);
        quickSort(arr, l, pivot - 1);
        quickSort(arr, pivot + 1, r);
    }

    private static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int j = l - 1;

        for (int i = l; i < r; i++) {
            if (arr[i] <= pivot) {
                j++;
                swap(arr, j, i);
            }
        }

        swap(arr, j + 1, r);
        return j + 1;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
