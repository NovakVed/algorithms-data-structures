package temp;

class Increments {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("i++: " + i++); // still 0
        System.out.println("i: " + i); // 1
        System.out.println("++i: " + ++i); // 2
        System.out.println("i++: " + i++); // 2
        System.out.println("i+1: " + (i + 1)); // 4
    }
}
