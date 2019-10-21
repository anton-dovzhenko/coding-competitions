import java.util.Arrays;

public class _494TargetSum2 {

    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        int zeroCount = 0;
        for (int n : nums) {
            sum += n;
            if (n == 0) {
                zeroCount++;
            }
        }
        if ((sum + S) % 2 == 1) {
            return 0;
        }
        if (Math.abs(S) == sum) {
            return (int) Math.pow(2, zeroCount);
        }
        int target = (sum + S) / 2;
        Arrays.sort(nums);
        return findSum(nums, target, 0);
    }

    public int findSum(int[] nums, int S, int pos) {

        int choices = 0;
        for (int i = pos; i < nums.length; i++) {
            if (nums[i] == S) {
                choices++;
            } else if (nums[i] > S) {
                break;
            } else {
                choices += findSum(nums, S - nums[i], i + 1);
            }

        }
        return choices;
    }
    
}