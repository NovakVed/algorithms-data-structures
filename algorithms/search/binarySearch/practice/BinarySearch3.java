package algorithms.search.binarySearch.practice;

public class BinarySearch3 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 8;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        if (target < 0)
            System.err.printf("Target number %d is not found", target);
        else
            System.out.printf("Target number %d is found in index: %d", target, result);
    }

    static private int binarySearch(int[] arr, int target, int l, int r) {
        if (l >= r)
            return -1;

        int m = l + (r - l) / 2;
        if (arr[m] == target)
            return m;
        if (arr[m] > target)
            return binarySearch(arr, target, l, m - 1);
        return binarySearch(arr, target, m + 1, r);
    }
}
