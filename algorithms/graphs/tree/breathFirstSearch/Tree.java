import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Tree {
    public static void main(String[] args) {
        Map<String, String[]> fileSystem = Map.of(
                "pics", new String[] { "2001", "odyssey.png" },
                "2001", new String[] { "a.png", "space.png" });

        Queue<String> queue = new LinkedList<>();
        queue.add("pics");

        printNames(fileSystem, queue);
    }

    static void printNames(Map<String, String[]> fileSystem, Queue<String> queue) {
        while (!queue.isEmpty()) {
            String currentPath = queue.poll();
            String[] children = fileSystem.get(currentPath);
            for (String node : children) {
                if (node.endsWith(".png")) {
                    System.out.println(node);
                } else {
                    queue.add(node);
                }
            }
        }
    }
}