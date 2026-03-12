package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class DijkstraAlgorithmGrokkingAlgorithm1 {
    static Map<String, Map<String, Integer>> graph = Map.of(
            "start", Map.of("a", 6, "b", 2),
            "a", Map.of("fin", 1),
            "b", Map.of("a", 3, "fin", 5),
            "fin", Map.of());

    static Map<String, Integer> costs = new HashMap<>() {
        {
            put("a", 6);
            put("b", 2);
            put("fin", Integer.MAX_VALUE);
        }
    };

    static Map<String, String> parents = new HashMap<>() {
        {
            put("a", "start");
            put("b", "start");
        }
    };

    static Set<String> visited = new HashSet<>();

    public static void main(String[] args) {
        String start = "start";
        dijkstraAlgorithm(start);
        printResult();
    }

    static void dijkstraAlgorithm(String start) {
        String shortestPath = findShortestPath(start);
        while (shortestPath != null) {
            int cost = costs.get(shortestPath);
            Map<String, Integer> neighbors = graph.get(shortestPath);

            for (Map.Entry<String, Integer> outNeighbor : neighbors.entrySet()) {
                String node = outNeighbor.getKey();
                int weight = cost + outNeighbor.getValue();
                if (weight < costs.get(node)) {
                    costs.put(node, weight);
                    parents.put(node, shortestPath);
                }
            }
            visited.add(shortestPath);
            shortestPath = findShortestPath(shortestPath);
        }
    }

    static String findShortestPath(String currentNode) {
        String closestNeighbor = null;
        int lowestCost = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> neighbour : graph.get(currentNode).entrySet()) {
            if (neighbour.getValue() < lowestCost && !visited.contains(neighbour.getKey())) {
                lowestCost = neighbour.getValue();
                closestNeighbor = neighbour.getKey();
            }
        }
        return closestNeighbor;
    }

    static void printResult() {
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
}
