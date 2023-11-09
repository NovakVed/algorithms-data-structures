package temp;

class XOR {
    static void main(String[] args) {
        int a = 1;
        int b = 2;
        a ^= b; // changing int 1 to bitwise 001
        /*
         * calculating 
         *      001
         * XOR  010
         * --------
         *      011 -> 3
         */
        b ^= a; // 2 -> 010
        /*
         * calculating 
         *      010
         * XOR  011
         * --------
         *      001 -> 1
         */
        a ^= b;
        /*
         * calculating 
         *      011
         * XOR  001
         * --------
         *      010 -> 2
         */
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

}
