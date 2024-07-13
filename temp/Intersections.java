package temp;

import java.util.HashSet;
import java.util.Set;

class Intersections {
    // ANSI color codes for different colors
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_GREEN = "\u001B[32m";
    static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>() {
            {
                add("avocado");
                add("tomato");
                add("banana");
            }
        };

        Set<String> vegetables = new HashSet<>() {
            {
                add("beets");
                add("carrots");
                add("tomato");
            }
        };

        // Union
        System.out.println(ANSI_RED + "Union:" + ANSI_RESET);
        Set<String> union = new HashSet<>(fruits);
        union.addAll(vegetables);
        union.stream().forEach(System.out::println);

        // Intersection
        System.out.println(ANSI_YELLOW + "\n\nIntersection:" + ANSI_RESET);
        Set<String> intersection = new HashSet<>(fruits);
        intersection.retainAll(vegetables);
        intersection.stream().forEach(System.out::println);

        // Difference from fruits
        System.out.println(ANSI_GREEN + "\n\nDifference from fruits:" + ANSI_RESET);
        Set<String> difference = new HashSet<>(fruits);
        difference.removeAll(vegetables);
        difference.stream().forEach(System.out::println);

        // Difference from vegetables
        System.out.println(ANSI_GREEN + "\n\nDifference from vegetables:" + ANSI_RESET);
        Set<String> differenceVegetables = new HashSet<>(vegetables);
        differenceVegetables.removeAll(fruits);
        differenceVegetables.stream().forEach(System.out::println);
    }

}
