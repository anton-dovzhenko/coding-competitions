import java.util.Arrays;

/**
 * Created by anton on 26/9/17.
 */
public class _238ProductofArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int zeroIndex = -1;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                zeroIndex = i;
            }
        }
        int product = 1;
        if (zeroCount > 1) {
            Arrays.fill(nums, 0);
        } else if (zeroCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (i != zeroIndex) {
                    product *= nums[i];
                }
            }
            Arrays.fill(nums, 0);
            nums[zeroIndex] = product;
        } else {
            for (int num : nums) {
                product *= num;
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = product / nums[i];
            }
        }
        return nums;
    }

    public int[] productExceptSelf2(int[] nums) {
        int[] result = new int[nums.length];
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        for (int i = 1; i < nums.length; i++) {
            nums[i] *= nums[i - 1];
            nums2[nums2.length - 1 - i] *= nums2[nums2.length - i];
        }
        result[0] = nums2[1];
        result[result.length - 1] = nums[nums.length - 2];
        for (int i = 1; i < nums.length - 1; i++) {
            result[i] = nums[i - 1] * nums2[i + 1];
        }
        return result;
    }

}
