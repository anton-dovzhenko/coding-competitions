/**
 * Created by anton on 26/2/17.
 */
public class _41FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i]);
                sum += nums[i];
                count++;
            }
        }
        if (min > 1) {
            return 1;
        }
        int expectedSum = (int) ((1 + count) * 0.5 * (count));
        if (sum == expectedSum) {
            return count + 1;
        } else {
            return expectedSum - (sum - max);
        }

    }

}
