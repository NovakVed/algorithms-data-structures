import java.util.Arrays;

class SlectionSortRep1 {
	public static void main(String[] args) {
		int[] arr = new int[] { 5, 6, 2, 5, 8, 1, 9, 0, 5 };
		selectionSort(arr);
		Arrays.stream(arr).forEach(System.out::println);
	}

	static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) minIndex = j;
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
}
