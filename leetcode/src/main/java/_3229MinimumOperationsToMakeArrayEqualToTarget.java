public class _3229MinimumOperationsToMakeArrayEqualToTarget {

    public long minimumOperations(int[] nums, int[] target) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] -= target[i];
        }
        long ops = 0;
        int dir = (int) Math.signum(nums[0]);
        int s = 0;
        for (int i = 1; i < nums.length; i++) {
            int curDir = (int) Math.signum(nums[i]);
            if (curDir != dir) {
                ops += minimumOperations(nums, s, i - 1);
                s = i;
            }
            dir = curDir;
        }
        ops += minimumOperations(nums, s, nums.length - 1);
        return ops;
    }

    private long minimumOperations(int[] nums, int s, int e) {
        int min = Integer.MAX_VALUE;
        for (int i = s; i <= e; i++) {
            nums[i] = Math.abs(nums[i]);
            min = Math.min(min, nums[i]);
        }
        if (min == 0 || min == Integer.MAX_VALUE) {
            return 0;
        }
        long ops = min;
        int start = s;
        for (int i = s; i <= e; i++) {
            nums[i] -= min;
            if (nums[i] == 0) {
                if (start != i) {
                    ops += minimumOperations(nums, start, i - 1);
                }
                start = i + 1;
            }
        }
        ops += minimumOperations(nums, start, e);
        return ops;
    }


}
