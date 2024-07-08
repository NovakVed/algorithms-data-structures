class SelectionSort {
	public static void main(String[] args) {
		byte[] arr = new byte[] { 64, 25, 12, 22, 11 };
		selectionSort(arr);
		for (byte b : arr) {
			System.out.println(b);
		}
	}

	private static void selectionSort(byte[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallestIndex] > arr[j])
					smallestIndex = j;
			}

			if (i != smallestIndex) {
				arr[i] ^= arr[smallestIndex];
				arr[smallestIndex] ^= arr[i];
				arr[i] ^= arr[smallestIndex];
			}
		}
	}
}
