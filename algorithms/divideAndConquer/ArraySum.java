package algorithms.divideAndConquer;

// Write out the recursive function to get sum of numbers in a list.
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(sum(arr, 0));
    }

    private static int sum(int[] arr, int i) {
        if (i >= arr.length - 1) return arr[i];
        return arr[i] + sum(arr, ++i);
    }

}
