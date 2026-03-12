package practice.priority;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

class DjikstraAlgorithmPriorityQueue1 {
    static Map<String, Map<String, Integer>> graph = Map.of(
            "start", Map.of("a", 6, "b", 2),
            "a", Map.of("fin", 1),
            "b", Map.of("a", 3, "fin", 5),
            "fin", Map.of());

    static Map<String, Integer> costs = new HashMap<>();
    static Map<String, String> parents = new HashMap<>();
    static Set<String> visited = new HashSet<>();

    public static void main(String[] args) {
        String start = "start";
        dijkstraAlgorithm(start);
        printResult();
    }

    private static void dijkstraAlgorithm(String start) {
        // PriorityQueue<Node> priorityQueue = new
        // PriorityQueue<>(Comparator.comparingInt(node -> node.cost));
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Node(start, 0));

        while (!priorityQueue.isEmpty()) {
            Node currentNode = priorityQueue.poll();
            if (!visited.contains(currentNode.name)) {
                visited.add(currentNode.name);

                for (Map.Entry<String, Integer> neighbor : graph.get(currentNode.name).entrySet()) {
                    String neighborName = neighbor.getKey();
                    int newCost = neighbor.getValue() + currentNode.cost;

                    if (newCost < costs.getOrDefault(neighbor.getKey(), Integer.MAX_VALUE)) {
                        costs.put(neighborName, newCost);
                        parents.put(neighborName, currentNode.name);
                        priorityQueue.add(new Node(neighborName, newCost));
                    }
                }
            }
        }
    }

    static class Node implements Comparable<Node> {
        String name;
        int cost;

        Node(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(cost, o.cost);
        }
    }

    private static void printResult() {
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
