package algorithms.greedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GreedySetCover {

    public static void main(String[] args) {
        List<Set<String>> stations = new ArrayList<>();
        stations.add(new HashSet<>(Arrays.asList("ID", "NV", "UT")));
        stations.add(new HashSet<>(Arrays.asList("WA", "ID", "MT")));
        stations.add(new HashSet<>(Arrays.asList("OR", "NV", "CA")));
        stations.add(new HashSet<>(Arrays.asList("NV", "UT")));
        stations.add(new HashSet<>(Arrays.asList("CA", "AZ")));

        // List of all states that need to be covered
        Set<String> allStates = new HashSet<>(Arrays.asList(
                "ID", "NV", "UT", "WA", "MT", "OR", "CA", "AZ"));

        // Find the minimum set of stations using the greedy algorithm
        // prints it!
        findMinimumCover(stations, allStates)
                .stream()
                .flatMap(Set::stream)
                .forEach(System.out::println);
    }

    // Greedy algorithm to find the minimum set of stations that covers all states
    public static Set<Set<String>> findMinimumCover(List<Set<String>> stations, Set<String> allStates) {
        Set<Set<String>> finalSolution = new HashSet<>();
        Set<String> coveredStates = new HashSet<>();
        while (!coveredStates.containsAll(allStates)) {
            Set<String> bestStation = null;
            int bestStationCoveredCount = 0;

            for (Set<String> station : stations) {
                Set<String> covered = new HashSet<>(station);
                covered.removeAll(coveredStates);

                if (covered.size() > bestStationCoveredCount) {
                    bestStation = station;
                    bestStationCoveredCount = covered.size();
                }
            }

            if (bestStation == null) {
                return null; // No solution found
            }

            finalSolution.add(bestStation);
            coveredStates.addAll(bestStation);
        }

        return finalSolution;
    }
}
