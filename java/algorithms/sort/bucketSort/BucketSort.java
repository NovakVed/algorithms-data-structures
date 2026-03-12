import java.util.Arrays;

class BucketSort {
    public void main(String[] args) {
        int[] arr = new int[] { 5, 4, 8, 9, 2, 1, 5 };
        bucketSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private void bucketSort(int[] arr) {
        // TODO
    }
}
