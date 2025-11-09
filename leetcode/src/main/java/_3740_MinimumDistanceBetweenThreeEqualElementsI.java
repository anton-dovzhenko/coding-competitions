import java.util.*;

public class _3740_MinimumDistanceBetweenThreeEqualElementsI {

    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (!indices.containsKey(n)) {
                indices.put(n, new ArrayList<>());
            }
            indices.get(n).add(i);
        }
        int result = Integer.MAX_VALUE;
        for (List<Integer> idx : indices.values()) {
            if (idx.size() >= 3) {
                for (int j = 0; j < idx.size() - 2; j++) {
                    result = Math.min(result, 2 * (idx.get(j + 2) - idx.get(j)));
                }
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

}


