import java.util.*;

/**
 * Created by anton on 27/10/18.
 */
public class _699FallingSquares {

    public List<Integer> fallingSquares(int[][] positions) {
        TreeMap<Integer, Integer> h = new TreeMap<>();
        for (int i = 0; i < positions.length; i++) {
            int left = positions[i][0];
            int length = positions[i][1];
            int right = left + length - 1;
            int max = 0;
            NavigableMap<Integer, Integer> subMap = h.subMap(left, true, right, true);
            Collection<Integer> v = subMap.values();
            if (!v.isEmpty()) {
                max = Collections.max(v);

            }
            Integer floorKeyLeft = h.floorKey(left);
            Integer floorKeyRight = subMap.isEmpty() ? floorKeyLeft : subMap.lastKey();
            if (floorKeyLeft != null && floorKeyLeft != left) {
                max = Math.max(h.get(floorKeyLeft), max);
            }
            if (!subMap.isEmpty()) {
                h.keySet().removeAll(subMap.keySet());
            }
            h.put(left, max + length);
            h.put(right + 1, Math.max(h.getOrDefault(i + 1, 0), floorKeyRight != null ? floorKeyRight : 0));
        }
        LinkedList<Integer> result = new LinkedList<>();
        for (int v : h.values()) {
            int value = v;
            if (!result.isEmpty()) {
                value = Math.max(value, result.getLast());
            }
            result.add(value);
        }
        result.removeLast();
        return result;
    }

}
