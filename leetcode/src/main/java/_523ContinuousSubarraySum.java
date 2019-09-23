public class _523ContinuousSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        int[] sums = new int[nums.length + 1];
        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];
        }

        for (int i = 0; i < sums.length - 2; i++) {
            for (int j = i + 2; j < sums.length; j++) {
                if (k == 0) {
                    if (sums[j] - sums[i] == 0) {
                        return true;
                    }
                } else {
                    if ((sums[j] - sums[i]) % k == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
