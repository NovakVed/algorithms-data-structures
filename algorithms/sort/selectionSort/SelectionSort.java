class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallestIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[smallestIndex] > arr[j]) {
                    smallestIndex = j;
                }
            }

            // Other way is using temp var
            // int temp = arr[i];
            // arr[i] = arr[smallestIndex];
            // arr[smallestIndex] = temp;

            // Swap the values using XOR -> better space complexity for int values
            if (i != smallestIndex) {
                arr[i] ^= arr[smallestIndex];
                arr[smallestIndex] ^= arr[i];
                arr[i] ^= arr[smallestIndex];
            }
        }
    }
}
