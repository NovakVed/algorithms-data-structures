import java.util.*;

// TODO: you have to learn how priorityQueue works, and what is the diff between Queue and Heap
class DijkstraAlgorithmPriorityQueue {

    static class Edge {
        int targetNode;
        int weight;

        Edge(int targetNode, int weight) {
            this.targetNode = targetNode;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {
        int node;
        int distance;

        Node(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    public static int[] dijkstra(List<List<Edge>> graph, int source) {
        int numberOfNodes = graph.size();
        int[] distances = new int[numberOfNodes];
        boolean[] visited = new boolean[numberOfNodes];

        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Node(source, 0));

        while (!priorityQueue.isEmpty()) {
            Node currentNode = priorityQueue.poll();
            int current = currentNode.node;

            if (visited[current])
                continue;
            visited[current] = true;

            for (Edge edge : graph.get(current)) {
                int neighbor = edge.targetNode;
                int newDist = distances[current] + edge.weight;

                if (newDist < distances[neighbor]) {
                    distances[neighbor] = newDist;
                    priorityQueue.add(new Node(neighbor, newDist));
                }
            }
        }

        return distances;
    }

    public static void main(String[] args) {
        int numberOfNodes = 5;
        List<List<Edge>> graph = new ArrayList<>(numberOfNodes);

        for (int i = 0; i < numberOfNodes; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(1, 10));
        graph.get(0).add(new Edge(2, 3));
        graph.get(1).add(new Edge(2, 1));
        graph.get(1).add(new Edge(3, 2));
        graph.get(2).add(new Edge(1, 4));
        graph.get(2).add(new Edge(3, 8));
        graph.get(2).add(new Edge(4, 2));
        graph.get(3).add(new Edge(4, 7));
        graph.get(4).add(new Edge(3, 9));

        int source = 0;
        int[] distances = dijkstra(graph, source);

        System.out.println("Shortest distances from node " + source + " to all other nodes:");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("Distance to node " + i + " is " + distances[i]);
        }
    }
}
