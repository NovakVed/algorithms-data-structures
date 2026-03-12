import java.util.Arrays;

public class InsertionSort3 {
    public static void main(String[] args) {
        int[] unsortedArray = new int[] { 4, 1, 6, 8, 9, 2, 3, 0, 2 };
        insertionSort(unsortedArray);
        Arrays.stream(unsortedArray).forEach(System.out::println);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key)
                arr[j + 1] = arr[j--];

            arr[j + 1] = key;
        }
    }
}
