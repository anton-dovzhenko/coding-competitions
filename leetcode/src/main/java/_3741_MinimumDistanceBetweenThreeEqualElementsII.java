import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class _3741_MinimumDistanceBetweenThreeEqualElementsII {

    public int minimumDistance(int[] nums) {
        int result = Integer.MAX_VALUE;
        Map<Integer, LinkedList<Integer>> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (!indices.containsKey(n)) {
                indices.put(n, new LinkedList<>());
            }
            LinkedList<Integer> list = indices.get(n);
            list.add(i);
            if (list.size() > 3) {
                list.removeFirst();
            }
            if (list.size() == 3) {
                result = Math.min(result, 2 * (list.get(2) - list.get(0)));
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

}
