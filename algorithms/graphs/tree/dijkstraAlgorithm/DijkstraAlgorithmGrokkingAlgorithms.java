package dijkstraAlgorithm;

import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DijkstraAlgorithmGrokkingAlgorithms {
    // Initializing the graph
    static Map<String, Map<String, Integer>> graph = Map.of(
            "start", Map.of("a", 6, "b", 2),
            "a", Map.of("fin", 1),
            "b", Map.of("a", 3, "fin", 5),
            "fin", Map.of());

    // Initializing the costs table
    static Map<String, Integer> costs = new HashMap<>() {
        {
            put("a", 6);
            put("b", 2);
            put("fin", Integer.MAX_VALUE);
        }
    };

    public static void main(String[] args) {
        dijkstraAlgorithm();
    }

    private static void dijkstraAlgorithm() {
        Set<String> visited = new HashSet<>();
        Map<String, String> parents = new HashMap<>() {
            {
                put("a", "start");
                put("b", "start");
                put("fin", null);
            }
        };

        // Dijkstra's algorithm
        String node = findLowestCostNode(costs, visited);
        while (node != null) {
            int cost = costs.get(node);
            Map<String, Integer> neighbors = graph.get(node);
            for (Map.Entry<String, Integer> n : neighbors.entrySet()) {
                int newCost = cost + n.getValue();
                if (newCost < costs.get(n.getKey())) {
                    costs.put(n.getKey(), newCost);
                    parents.put(n.getKey(), node);
                }
            }
            visited.add(node);
            node = findLowestCostNode(costs, visited);
        }

        // Print the results
        System.out.println("Costs: " + costs);
        System.out.println("Parents: " + parents);

        // If you want to print the shortest path to the "fin" node
        System.out.println("Shortest path to 'fin':");
        List<String> path = new ArrayList<>();
        for (String at = "fin"; at != null; at = parents.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);
        System.out.println(path);
    }

    private static String findLowestCostNode(Map<String, Integer> costs, Set<String> visited) {
        int lowestCost = Integer.MAX_VALUE;
        String lowestCostNode = null;
        for (Map.Entry<String, Integer> node : costs.entrySet()) {
            int cost = node.getValue();
            if (cost < lowestCost && !visited.contains(node.getKey())) {
                lowestCost = cost;
                lowestCostNode = node.getKey();
            }
        }
        return lowestCostNode;
    }
}
