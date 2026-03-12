package algorithms.math.fibonacciAlgorithm;

// time complexity is O(2^n), while memory complexity is O(n)
public class FibonacciSequence {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}