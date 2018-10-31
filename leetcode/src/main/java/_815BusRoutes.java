import java.util.*;

/**
 * Created by anton on 27/4/18.
 */
public class _815BusRoutes {

    public int numBusesToDestination(int[][] routes, int S, int T) {
        Map<Integer, Set<Integer>> stopBusMap = new HashMap<>();
        Map<Integer, Set<Integer>> busStopMap = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < routes[i].length; j++) {
                Set<Integer> buses = stopBusMap.get(routes[i][j]);
                Set<Integer> stops = busStopMap.get(i);
                if (buses == null) {
                    buses = new HashSet<>();
                    stopBusMap.put(routes[i][j], buses);
                }
                if (stops == null) {
                    stops = new HashSet<>();
                    busStopMap.put(i, stops);
                }
                buses.add(i);
                stops.add(routes[i][j]);
            }
        }
        return nextStops(new HashSet<>(Arrays.asList(S)), new HashSet<>(), stopBusMap, busStopMap, T, 0);
    }

    private int nextStops(Set<Integer> stops, Set<Integer> visitedStops
            , Map<Integer, Set<Integer>> stopBusMap
            , Map<Integer, Set<Integer>> busStopMap
            , int T, int busCount) {
        if (stops.isEmpty()) {
            return -1;
        }
        visitedStops.addAll(stops);
        Set<Integer> newStops = new HashSet<>();
        for (Integer stop : stops) {
            if (stop == T) {
                return busCount;
            }
            Set<Integer> buses = stopBusMap.get(stop);
            for (Integer bus : buses) {
                Set<Integer> busStops = busStopMap.get(bus);
                busStops.removeAll(visitedStops);
                newStops.addAll(busStops);
            }
        }
        return nextStops(newStops, visitedStops, stopBusMap, busStopMap, T, busCount + 1);
    }

}
