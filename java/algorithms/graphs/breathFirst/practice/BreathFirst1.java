package practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class BreathFirst1 {
    static String root = "you";
    static Map<String, String[]> friendsNetwork = Map.of(
            "you", new String[] { "alice", "bob", "claire" },
            "bob", new String[] { "anuj", "peggy" },
            "alice", new String[] { "peggy" },
            "claire", new String[] { "thom", "jonny" },
            "anuj", new String[] {},
            "peggy", new String[] {},
            "thom", new String[] {},
            "jonny", new String[] {});

    public static void main(String[] args) {
        // we search through friendsNetwork until we find a Mango salesman, which we
        // identify if his name ends with 'm'
        if (breathFirstSearchFindMangoSalesman()) {
            System.out.println("Mango seller is found!");
        } else {
            System.err.println("Mango salesman is not found in your friends network");
        }
    }

    public static boolean breathFirstSearchFindMangoSalesman() {
        Queue<String> queue = new LinkedList<>() {
            {
                add(root);
            }
        };

        Set<String> visited = new HashSet<>();
        while (!queue.isEmpty()) {
            String currentFriend = queue.poll();
            for (String friend : friendsNetwork.get(currentFriend)) {
                if (visited.add(friend)) {
                    if (friend.endsWith("m")) { // how we identify mango salesman
                        return true;
                    }
                    queue.add(friend);
                }
            }
        }
        return false;
    }
}