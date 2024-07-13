package algorithms.greedyAlgorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class GreedySetCover {

    public static void main(String[] args) {
        Set<String> allStates = new HashSet<>(Arrays.asList("mt", "wa", "or", "id", "nv", "ut", "ca", "az", "vn"));
        Map<String, Set<String>> stations = new LinkedHashMap<>();

        stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));
        stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
        stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
        stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));
        stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));

        findMinimumCover(stations, allStates).stream().forEach(System.out::println);
    }

    public static Set<String> findMinimumCover(Map<String, Set<String>> stations, Set<String> allStates) {
        Set<String> finalStations = new HashSet<String>();
        Set<String> statesRemaining = new HashSet<>(allStates);

        while (!statesRemaining.isEmpty()) {
            String bestStation = null;
            Set<String> statesCovered = new HashSet<>();

            for (Map.Entry<String, Set<String>> station : stations.entrySet()) {
                Set<String> covered = new HashSet<>(statesRemaining);
                covered.retainAll(station.getValue());

                if (covered.size() > statesCovered.size()) {
                    bestStation = station.getKey();
                    statesCovered = covered;
                }
            }

            if (statesCovered.isEmpty()) {
                break;
            }

            statesRemaining.removeAll(statesCovered);
            finalStations.add(bestStation);
        }

        // Print any states that could not be covered
        if (!statesRemaining.isEmpty()) {
            System.out.println("The following states could not be covered: " + statesRemaining);
        }

        return finalStations;
    }
}
