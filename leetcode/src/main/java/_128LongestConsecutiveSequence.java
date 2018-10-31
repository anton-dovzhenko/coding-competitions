import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 27/8/17.
 */
public class _128LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxLength = Math.min(1, nums.length);
        int length = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                length++;
            } else if (nums[i] != nums[i - 1]) {
                length = 1;
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }

    public int longestConsecutive2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!map.containsKey(num)) {
                int left = map.getOrDefault(num - 1, 0);
                int right = map.getOrDefault(num + 1, 0);
                int seqLength = left + right + 1;
                map.put(num, seqLength);
                map.put(num - left, seqLength);
                map.put(num + right, seqLength);
            }
        }
        return map.isEmpty() ? 0 : Collections.max(map.values());
    }

}
