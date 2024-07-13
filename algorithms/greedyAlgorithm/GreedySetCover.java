package algorithms.greedyAlgorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class GreedySetCover {

    public static void main(String[] args) {
        Set<String> allStates = new HashSet<>(Arrays.asList("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));
        Map<String, Set<String>> stations = new LinkedHashMap<>();

        stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));
        stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
        stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
        stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));
        stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));

        // Find the minimum set of stations using the greedy algorithm
        findMinimumCover(stations, allStates).stream().forEach(System.out::println);
    }

    // Greedy algorithm to find the minimum set of stations that covers all states
    public static Set<String> findMinimumCover(Map<String, Set<String>> stations, Set<String> allStates) {
        Set<String> finalStations = new HashSet<String>();
        while (!allStates.isEmpty()) {
            String bestStation = null;
            Set<String> statesCovered = new HashSet<>();

            for (Map.Entry<String, Set<String>> station : stations.entrySet()) {
                Set<String> covered = new HashSet<>(allStates);
                covered.retainAll(station.getValue());

                if (covered.size() > statesCovered.size()) {
                    bestStation = station.getKey();
                    statesCovered = covered;
                }
                allStates.removeIf(statesCovered::contains);

                if (bestStation != null) {
                    finalStations.add(bestStation);
                }
            }
        }
        return finalStations;
    }
}
