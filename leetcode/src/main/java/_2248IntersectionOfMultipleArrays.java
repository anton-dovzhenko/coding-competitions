import java.util.*;

public class _2248IntersectionOfMultipleArrays {

    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int[] num : nums) {
            for (int n : num) {
                occurrences.put(n, 1 + occurrences.getOrDefault(n, 0));
            }
        }
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() == nums.length) {
                result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        return result;
    }

}
