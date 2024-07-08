class InsertionSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 64, 22, 25, 11, 3, 2, 5, 62, 22 };
		insertionSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j--];
			}

			arr[j + 1] = key;
		}
	}
}
