package practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BreathFirstSearch3 {

    public static void main(String[] args) {
        Map<String, String[]> graph = Map.of(
                "me", new String[] { "alice", "bob", "claire" },
                "bob", new String[] { "anuj", "peggy" },
                "alice", new String[] { "peggy" },
                "claire", new String[] { "thom", "jonny" },
                "anuj", new String[] {},
                "peggy", new String[] {},
                "thom", new String[] {},
                "jonny", new String[] {});

        Queue<String> queue = new LinkedList<>() {
            {
                add("me");
            }
        };

        var isMangoSellerFound = breathFirstSearch(queue, graph);
        System.out.println("is mango seller found: " + isMangoSellerFound);
    }

    private static boolean breathFirstSearch(Queue<String> queue, Map<String, String[]> friendsNetwork) {
        Set<String> visited = new HashSet<>();
        while (!queue.isEmpty()) {
            String currentFriend = queue.poll();
            String[] friends = friendsNetwork.get(currentFriend);
            for (String friend : friends) {
                if (visited.add(friend)) {
                    if (isMangoSalesman(friend))
                        return true;
                    queue.add(friend);
                }
            }
        }
        return false;
    }

    private static boolean isMangoSalesman(String friend) {
        return friend.endsWith("m");
    }
}
