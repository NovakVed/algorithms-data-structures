public class BinarySearch4 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int result = binarySearch(arr, 1, 0, arr.length - 1);

        if (result < 0) {
            System.err.println("Target not found");
        } else {
            System.out.println("Found at index: " + result);
        }
    }

    private static int binarySearch(int[] arr, int target, int l, int r) {
        if (l > r)
            return -1;

        int m = l + (r - l) / 2;
        if (arr[m] == target)
            return m;
        if (arr[m] < target)
            return binarySearch(arr, target, m + 1, r);
        return binarySearch(arr, target, l, m - 1);
    }
}