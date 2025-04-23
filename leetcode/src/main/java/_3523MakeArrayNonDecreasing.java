public class _3523MakeArrayNonDecreasing {

    public int maximumPossibleSize(int[] nums) {
        int changes = 0;
        int last = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < last) {
                changes++;
            } else {
                last = nums[i];
            }
        }
        return nums.length + 1 - changes;
    }

}
