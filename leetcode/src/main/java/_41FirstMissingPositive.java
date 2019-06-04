/**
 * Created by anton on 26/2/17.
 */
public class _41FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        movePositives(nums, 0);
        int start = 1;
        for (int n : nums) {
            if (n == start) {
                start++;
            } else {
                break;
            }
        }
        return start;
    }

    private void movePositives(int[] nums, int i) {
        if (i < nums.length) {
            int n = nums[i];
            if (n > 0 && n <= nums.length && n - 1 != i && nums[n - 1] != n) {
                int move = nums[n - 1];
                nums[n - 1] = n;
                nums[i] = move;
                movePositives(nums, i );
            } else {
                movePositives(nums, i + 1);
            }
        }
    }

    public int firstMissingPositive0(int[] nums) {
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
