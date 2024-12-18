package algorithms.devideAndConqure;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 9, 3, 8, 5 };
        System.out.println(max(arr, 0));
    }

    private static int max(int[] arr, int i) {
        if (i >= arr.length - 1) return arr[i];
        int next = max(arr, ++i);
        return arr[i] > next ? arr[i] : next;
    }
}
