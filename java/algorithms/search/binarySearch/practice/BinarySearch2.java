class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 1;
        int targetIndex = binarySearch(arr, target, 0, arr.length - 1);
        if (targetIndex > -1) {
            System.out.printf("number: %d is found on index: %d", target, targetIndex);
        } else {
            System.out.printf("number: %d is not found", target);
        }
    }

    static int binarySearch(int[] arr, int target, int l, int r) {
        if (l > r)
            return -1;

        int m = l + (r - l) / 2;
        if (arr[m] == target)
            return m;

        if (target < arr[m])
            return binarySearch(arr, target, l, m - 1);
        return binarySearch(arr, target, m + 1, r);
    }
}
