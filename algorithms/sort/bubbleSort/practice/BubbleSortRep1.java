import java.util.Arrays;

/**
 * BubbleSortRep1
 */
public class BubbleSortRep1 {
    public static void main(String[] args) {
        int[] unsortedArray = new int[] { 4, 1, 2, 6, 7, 9, 2, 1, 6, 0, };
        bubbleSort(unsortedArray);

        Arrays.stream(unsortedArray).forEach(System.out::println);
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    arr[i] ^= arr[j];
                    arr[j] ^= arr[i];
                    arr[i] ^= arr[j];
                }
            }
            // ex. start -> [4, 1, 2, 9, 2, 0]
            // ex. first iteration -> [1, 2, 4, 2, 0, 9]
        }
    }
}