import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 26/9/17.
 */
public class _560SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        int arrayCount = nums[0] == k ? 1 : 0;
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(nums[0], 1);
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
            if (nums[i] == k) {
                arrayCount++;
            }
            Integer c = counts.get(nums[i] - k);
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
            if (c != null) {
                arrayCount += c;
            }
        }
        return arrayCount;
    }

}
