class HornerAlgorithm {
    public static void main(String[] args) {
        int p[] = { -1, 0, 2, 0, 3, 5 };
        int x = -2;

        System.out.println(hornerRule(p, x));
    }

    // How it works: https://www.youtube.com/watch?v=Z393AcN_Gz0
    static int hornerRule(int[] p, int x) {
        int result = p[0];
        for (int i = 1; i < p.length; i++)
            result = p[i] + (x * result);
        return result;
    }
}
