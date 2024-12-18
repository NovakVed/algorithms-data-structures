package algorithms.devideAndConqure;

public class ArrayCount {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(count(arr, 0));
    }

    private static int count(int[] arr, int i) {
        if (i >= arr.length - 1) return i;
        return count(arr, ++i);
    }
}
