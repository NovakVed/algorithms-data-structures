class SelectionSort2 {
    public void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };
        selectionSort2(arr);
        for (int n : arr)
            System.out.printf("%d ", n);
    }

    private void selectionSort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallestIndex = i;
            int j = i + 1;
            while (j < arr.length) {
                if (arr[smallestIndex] > arr[j]) {
                    smallestIndex = j;
                }
                j++;
            }

            if (i != smallestIndex) {
                arr[i] ^= arr[smallestIndex];
                arr[smallestIndex] ^= arr[i];
                arr[i] ^= arr[smallestIndex];
            }
        }
    }

}
