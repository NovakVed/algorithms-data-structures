import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class DepthFirstSearchTree1 {
    static Map<String, String[]> fileSystem = Map.of(
            "pics", new String[] { "2001", "odyssey.png" },
            "2001", new String[] { "a.png", "space.png" });
    static Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) {
        queue.add("pics");
        depthFirstSearch();
    }

    static void depthFirstSearch() {
        if (queue.isEmpty()) {
            return;
        }

        String file = queue.poll();
        if (!file.endsWith(".png")) {
            String[] subFiles = fileSystem.get(file);
            for (String subFile : subFiles) {
                queue.add(subFile);
                depthFirstSearch();
            }
        } else
            System.out.println(file);
    }
}
