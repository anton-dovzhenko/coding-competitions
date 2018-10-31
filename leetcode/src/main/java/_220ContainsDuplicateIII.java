import java.util.TreeMap;

/**
 * Created by anton on 16/12/17.
 */
public class _220ContainsDuplicateIII {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (t < 0) {
            return false;
        }
        TreeMap<Long, Integer> lastOccurrence = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            long n = nums[i];
            for (int index : lastOccurrence.subMap(n - t, true, n + t, true).values()) {
                if (i - index <= k) {
                    return true;
                }
            }
            lastOccurrence.put(n, i);
        }
        return false;
    }
}
