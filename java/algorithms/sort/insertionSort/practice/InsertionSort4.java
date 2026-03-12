import java.util.Arrays;

public class InsertionSort4 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 8, 9, 1, 0, 9, 1, 4 };
        insertionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j--];
            }
            arr[j + 1] = key;
        }
    }
}
