class EuclidsAlgorithm {
    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(270, 192));
    }

    private static int greatestCommonDivisor(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        int q = a / b;
        int r = a - b * q;

        return greatestCommonDivisor(b, r);
    }
}
