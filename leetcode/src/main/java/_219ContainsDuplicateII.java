import java.util.HashMap;

/**
 * Created by anton on 16/12/17.
 */
public class _219ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> lastOccurrence = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = lastOccurrence.get(nums[i]);
            if (index != null && i - index <= k) {
                return true;
            }
            lastOccurrence.put(nums[i], i);
        }
        return false;
    }
}
