/**
 * Created by anton on 21/10/17.
 */
//303. Range Sum Query - Immutable
public class _303NumArray {

    private final int[] nums;

    public _303NumArray(int[] nums) {
        this.nums = nums;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return nums[j];
        }
        return nums[j] - nums[i - 1];
    }

}
