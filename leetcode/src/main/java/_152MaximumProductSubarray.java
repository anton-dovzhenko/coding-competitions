

/**
 * Created by anton on 25/9/17.
 */
public class _152MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int max = nums[0];
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                end = i;
            } else {
                max = Math.max(max, 0);
                max = Math.max(max, maxProduct(nums, start, end));
                start = i + 1;
                end = start;
            }
        }
        if (end < nums.length) {
            max = Math.max(max, maxProduct(nums, start, end));
        }
        return max;
    }

    private int maxProduct(int[] nums, int start, int end) {
        int product = 1;
        for (int i = start; i <= end; i++) {
            product *= nums[i];
        }
        if (product > 0) {
            return (int) product;
        }
        if (end - start < 2) {
            return Math.max(nums[start], nums[end]);
        }
        int leftProd = 1;
        int rightProd = 1;
        do {
            leftProd *= nums[start];
        } while (nums[start++] > 0);
        do {
            rightProd *= nums[end];
        } while (nums[end--] > 0);
        return (product / Math.max(leftProd, rightProd));
    }

}
