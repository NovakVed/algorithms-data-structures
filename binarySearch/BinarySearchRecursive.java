package binarySearch;

/*
 * Binary Search algorithm
 * Time Complexity O(n log n) or O(n lg n) -> lg n = log2 n
 */
class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 4;

        if (binarySearch(sortedArray, target, 0, sortedArray.length - 1)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found!");
        }
    }

    static boolean binarySearch(int[] arr, int target, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return false;
        }

        int mid = leftIndex + (rightIndex - leftIndex) / 2;

        if (target == arr[mid]) {
            return true;
        }

        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, rightIndex);
        }

        return binarySearch(arr, target, leftIndex, mid - 1);
    }
}

/*
 * PSEUDOCODE for BinSearch
 * BinarySearch(A, target, leftIndex, rightIndex)
 *     if leftIndex > rightIndex then
 *         return FALSE
 *     end if
 *     
 *     mid = leftIndex + (rightIndex - leftIndex) / 2
 *     
 *     if target == arr[mid] then
 *         return TRUE
 *     end if
 * 
 *     if arr[mid] < target then
 *         return binarySearch(arr, target, mid + 1, rightIndex)
 *     end if
 *     
 *     binarySearch(arr, target, leftIndex, mid - 1)
 */