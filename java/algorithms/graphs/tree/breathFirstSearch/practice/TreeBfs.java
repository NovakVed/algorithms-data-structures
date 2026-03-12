import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TreeBfs {
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
            String currentFile = queue.poll();
            if (currentFile.endsWith(".png")) {
                System.out.println(currentFile);
                continue;
            }

            String[] neighbouringFiles = fileSystem.get(currentFile);
            for (String file : neighbouringFiles) {
                queue.add(file);
            }
        }
    }
}
