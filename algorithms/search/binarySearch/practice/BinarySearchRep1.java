class BinarySearchRep1 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int target = 7;
		System.out.println(binarySearch(arr, target, 0, arr.length - 1));
	}

	static int binarySearch(int[] arr, int target, int l, int r) {
		if (l >= r) {
			return -1;
		}

		int middleIndex = l + (r - l) / 2;
		if (arr[middleIndex] == target) {
			return middleIndex;
		}

		if (arr[middleIndex] > target) {
			return binarySearch(arr, target, l, middleIndex - 1);
		}

		return binarySearch(arr, target, middleIndex + 1, r);
	}
}
