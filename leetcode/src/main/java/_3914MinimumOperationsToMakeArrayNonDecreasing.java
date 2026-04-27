public class _3914MinimumOperationsToMakeArrayNonDecreasing {

    public long minOperations(int[] nums) {
        long sum = 0;
        int h = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < h) {
                sum += (h - nums[i]);
            }
            h = nums[i];
        }
        return sum;
    }

    public static void main(String... args) {
        System.out.println(new _3914MinimumOperationsToMakeArrayNonDecreasing().minOperations(new int[]{3, 3, 2, 1}));
        System.out.println(new _3914MinimumOperationsToMakeArrayNonDecreasing().minOperations(new int[]{5, 1, 2, 3}));
        System.out.println(new _3914MinimumOperationsToMakeArrayNonDecreasing().minOperations(new int[]{7, 26, 2, 25, 27}));
    }

}
