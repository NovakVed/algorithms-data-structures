package practice;

public class EuclidsAlgorithm1 {
    // gcd(A, B) -> gcd(270, 192) -> euclids
    // A = B * Q + R
    // 270 = 192 * 1 + 78
    // gcd(B, R) -> gcd(192, 78)...

    public static void main(String[] args) {
        int a = 270;
        int b = 192;

        int result = gcd(a, b);
        System.out.println("Greatest common divider of ("
                + a + ", " + b + ")" + ": " + result);
    }

    private static int gcd(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        int q = a / b;
        int r = a - b * q;
        return gcd(b, r);
    }
}
