package algorithms.math.fibonacciAlgorithm.practice;

public class FibonacciSequence1 {

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    // 5! = 5 * 4 * 3 * 2 * 1
    private static int fibonacci(int n) {
        if (n <= 1) return 1;
        return n * fibonacci(n - 1);
    }
}
