import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;

class DepthFirstSearchTree2 {
    static Map<String, String[]> fileSystem = Map.of(
            "pics", new String[] { "2001", "odyssey.png" },
            "2001", new String[] { "a.png", "space.png" });

    static Queue<String> queue;

    public static void main(String[] args) {
        queue = new LinkedList<>() {
            {
                add("pics");
            }
        };
        depthFirstSearch();
    }

    private static void depthFirstSearch() {
        if (queue.isEmpty())
            return;

        for (String file : fileSystem.get(queue.poll())) {
            if (file.endsWith(".png")) {
                System.out.println(file);
            } else {
                queue.add(file);
                depthFirstSearch();
            }
        }
    }
}
