import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class BreathFirstSearch2 {
    Map<String, String[]> fileSystem = Map.of(
            "pics", new String[] { "2001", "odyssey.png" },
            "2001", new String[] { "a.png", "space.png" });
    Queue<String> queue = new LinkedList<>() {
        {
            add("pics");
        }
    };

    public void main(String[] args) {
        breathFirstSearch();
    }

    private void breathFirstSearch() {
        while (!queue.isEmpty()) {
            String root = queue.poll();
            String[] children = fileSystem.get(root);
            for (String file : children) {
                if (file.endsWith(".png")) {
                    System.out.println(file);
                } else
                    queue.add(file);
            }
        }
    }
}
