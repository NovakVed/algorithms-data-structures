import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Tree1 {
    static Map<String, String[]> fileSystem = Map.of(
            "pics", new String[] { "2001", "odyssey.png" },
            "2001", new String[] { "a.png", "space.png" });
    static Queue<String> queue = new LinkedList<>() {
        {
            add("pics");
        }
    };

    public static void main(String[] args) {
        while (!queue.isEmpty()) {
            String file = queue.poll();
            if (!file.endsWith(".png")) {
                for (String subFile : fileSystem.get(file)) {
                    queue.add(subFile);
                }
            } else
                System.out.println(file);
        }
    }
}
