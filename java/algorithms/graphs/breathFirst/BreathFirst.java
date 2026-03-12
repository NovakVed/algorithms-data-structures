import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BreathFirst {
    private static String targetPerson = "you";

    private static Map<String, String[]> graph = Map.of(
            "you", new String[] { "alice", "bob", "claire" },
            "alice", new String[] { "peggy" },
            "bob", new String[] { "peggy", "anuj" },
            "claire", new String[] { "jonny", "thom" },
            "anuj", new String[] {},
            "peggy", new String[] {},
            "jonny", new String[] {});

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add(targetPerson);

        if (!searchQueue(queue)) {
            System.out.println("Mango seller not found in your network");
        }
    }

    private static boolean searchQueue(Queue<String> queue) {
        Set<String> visited = new HashSet<>();
        visited.add(queue.peek());

        while (!queue.isEmpty()) {
            String person = queue.poll();
            if (personIsMangoSeller(person)) {
                System.out.println(person + " is a mango seller!");
                return true;
            } else {
                String[] friends = graph.get(person);
                for (String friend : friends) {
                    if (!visited.contains(friend)) {
                        queue.add(friend);
                        visited.add(friend);
                    }
                }
            }
            System.out.println("Current search queue: " + queue);
        }
        return false;
    }

    private static boolean personIsMangoSeller(String name) {
        return name.endsWith("m");
    }
}
