package practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class BreathFirst2 {
    String root = "you";
    Map<String, String[]> friendsNetwork = Map.of(
            "you", new String[] { "alice", "bob", "claire" },
            "bob", new String[] { "anuj", "peggy" },
            "alice", new String[] { "peggy" },
            "claire", new String[] { "thom", "jonny" },
            "anuj", new String[] {},
            "peggy", new String[] {},
            "thom", new String[] {},
            "jonny", new String[] {});

    public void main(String[] args) {
        // we search through friendsNetwork until we find a Mango salesman, which we
        // identify if his name ends with 'm'
        if (breathFirstSearchFindMangoSalesman()) {
            System.out.println("Mango seller is found!");
        } else {
            System.err.println("Mango salesman is not found in your friends network");
        }
    }

    private boolean breathFirstSearchFindMangoSalesman() {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>() {
            {
                add(root);
            }
        };

        while (!queue.isEmpty()) {
            String currentFriend = queue.poll();
            String[] connections = friendsNetwork.get(currentFriend);
            for (String friend : connections) {
                if (visited.add(friend)) {
                    if (isMangoSalesman(friend)) return true;
                    queue.add(friend);
                }
            }

        }
        return false;
    }

    private boolean isMangoSalesman(String friend) {
        return friend.endsWith("m");
    }

}
