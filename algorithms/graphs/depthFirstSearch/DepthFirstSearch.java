import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class DepthFirstSearch {
    static Map<String, String[]> fileSystem = Map.of(
            "pics", new String[] { "2001", "odyssey.png" },
            "2001", new String[] { "a.png", "space.png" });

    static Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) {
        queue.add("pics");
        printNames();
    }

    static void printNames() {
        String currentNode = queue.poll();
        String[] children = fileSystem.get(currentNode);
        for (String node : children) {
            if (node.endsWith(".png")) {
                System.out.println(node);
            } else {
                queue.add(node);
                printNames();
            }
        }
    }
}