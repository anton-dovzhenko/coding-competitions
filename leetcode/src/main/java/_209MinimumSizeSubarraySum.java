import java.util.Arrays;

/**
 * Created by anton on 12/4/18.
 */
public class _209MinimumSizeSubarraySum {

    public int minSubArrayLen(int s, int[] nums) {
        int start = 0;
        long sum = 0;
        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum >= s) {
                minCount = Math.min(minCount, i - start + 1);
                for (int j = start; j <= i; j++) {
                    sum -= nums[j];
                    start = j + 1;
                    if (sum >= s) {
                        minCount = Math.min(minCount, i - j);
                    } else {
                        break;
                    }
                }
            }
        }
        return minCount == Integer.MAX_VALUE ? 0 : minCount;
    }
}
