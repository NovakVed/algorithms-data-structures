class InsertionSort2 {
    public void main(String[] args) {
        int[] arr = new int[] { 3, 4, 2, 1, 7, 6, 0 };
        insertionSort(arr);
        for (int n : arr)
            System.out.printf("%d ", n);
    }

    private void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                arr[j] = arr[j] + arr[j - 1];
                arr[j - 1] = arr[j] - arr[j - 1];
                arr[j] = arr[j] - arr[j - 1];
                j--;
            }
        }
    }
}
