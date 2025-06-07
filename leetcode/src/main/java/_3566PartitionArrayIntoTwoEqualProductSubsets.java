import java.util.Arrays;

public class _3566PartitionArrayIntoTwoEqualProductSubsets {

    public boolean checkEqualPartitions(int[] nums, long target) {
        long prd = 1;
        for (int n : nums) {
            if (n > target) {
                return false;
            }
            prd *= n;
        }
        if (prd != target * target) {
            return false;
        }
        Arrays.sort(nums);
        return isMatch(nums, target, -1);
    }

    private boolean isMatch(int[] nums, long target, int start) {
        if (target == 1) {
            return true;
        }
        for (int i = start + 1; i < nums.length; i++) {
            if (target % nums[i] == 0) {
                boolean match = isMatch(nums, target / nums[i], i);
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }

}
