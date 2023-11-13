package search.binarySearch;

class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 11;

        int result = binarySearch(sortedArray, target);
        if (result != -1) {
            System.out.println("Found at position: " + result);
        } else {
            System.out.println("NOT FOUND");
        }
    }

    static int binarySearch(int[] arr, int target) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex <= rightIndex) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                leftIndex = mid + 1;
            } else {
                rightIndex = mid - 1;
            }
        }

        return -1;
    }

}
