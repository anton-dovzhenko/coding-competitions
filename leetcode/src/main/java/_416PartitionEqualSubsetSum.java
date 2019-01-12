import java.util.Arrays;

public class _416PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        int L = nums.length;
        Arrays.sort(nums);
        int[] sums = new int[L];
        for (int i = 0; i < L; i++) {
            sums[i] = nums[i] + (i > 0 ? sums[i - 1] : 0);
        }
        if (sums[L - 1] % 2 == 1) {
            return false;
        }
        return canPartition(nums, sums, nums.length, sums[L - 1] / 2);
    }

    private boolean canPartition(int[] nums, int[] sums, int length, int target) {
        if (target == 0) {
            return true;
        } else if (target < 0) {
            return false;
        }

        for (int i = length - 1; i >=0; i--) {
            if (sums[i] < target) {
                break;
            }
            if (canPartition(nums, sums, i, target - nums[i])) {
                return true;
            }
        }
        return false;
    }

}
