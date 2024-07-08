import java.util.Arrays;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 1, 4, 3, 7, 3 };
        selectionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            int smallestIndex = i;
            while (j < arr.length) {
                if (arr[j] < arr[smallestIndex])
                    smallestIndex = j;
                j++;
            }

            if (i != smallestIndex) {
                arr[i] ^= arr[smallestIndex];
                arr[smallestIndex] ^= arr[i];
                arr[i] ^= arr[smallestIndex];
            }
        }
    }
}
