import java.util.Map;

class DepthFirstSearchTree2 {
    static Map<String, String[]> fileSystem = Map.of(
            "pics", new String[] { "2001", "odyssey.png" },
            "2001", new String[] { "a.png", "space.png" });

    public static void main(String[] args) {
        depthFirstSearch("pics");
    }

    private static void depthFirstSearch(String dir) {
        for (String file : fileSystem.get(dir)) {
            if (file.endsWith(".png")) {
                System.out.println(file);
            } else {
                depthFirstSearch(file);
            }
        }
    }
}
