class BinarySearch {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10 };
		System.out.println(binarySearch(arr, 5, 0, arr.length - 1));
	}

	private static int binarySearch(int[] arr, int target, int smallestIndex, int largestIndex) {
		if (smallestIndex > largestIndex)
			return -1;

		// int middleIndex = (smallestIndex + largestIndex) / 2;
		int middleIndex = smallestIndex + (largestIndex - smallestIndex) / 2;
		if (arr[middleIndex] == target)
			return middleIndex;
		if (arr[middleIndex] < target)
			return binarySearch(arr, target, middleIndex - 1, largestIndex);
		return binarySearch(arr, target, smallestIndex, middleIndex + 1);
	}
}
