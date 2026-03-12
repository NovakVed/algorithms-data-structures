import java.util.Arrays;

public class SelectionSort3 {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 2, 1, 6, 8, 9, 33, 2, 3, 4 };
        int[] result = selectionSort(arr);
        Arrays.stream(result).forEach(System.out::println);
        // for (int num : result) System.out.println(num);
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            if (i != smallestIndex)
                swap(arr, i, smallestIndex);
        }

        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }
}
