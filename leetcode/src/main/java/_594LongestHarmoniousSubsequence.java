import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by anton on 3/7/17.
 */
public class _594LongestHarmoniousSubsequence {

    public int findLHS(int[] nums) {
        TreeMap<Integer, Integer> occurrences = new TreeMap<>();
        for (int num : nums) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        int maxLength = 0;
        Map.Entry<Integer, Integer> prevEntry = null;
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            int num = entry.getKey();
            int len = 0;
            if (prevEntry != null && prevEntry.getKey() == num - 1) {
                len = prevEntry.getValue() + entry.getValue();
            }
            prevEntry = entry;
            maxLength = Math.max(maxLength, len);
        }
        return maxLength;
    }

    public int findLHSCopy(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                result = Math.max(result, map.get(key + 1) + map.get(key));
            }
        }
        return result;
    }
}
