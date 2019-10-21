public class _494TargetSum {

    public int findTargetSumWays(int[] nums, int S) {
        return findTargetSumWays(nums, S, 0);
    }

    private int findTargetSumWays(int[] nums, int S, int pos) {
        if (pos == nums.length) {
            return S == 0 ? 1 : 0;
        }
        return findTargetSumWays(nums, S - nums[pos], pos + 1) +findTargetSumWays(nums, S + nums[pos], pos + 1);
    }

}