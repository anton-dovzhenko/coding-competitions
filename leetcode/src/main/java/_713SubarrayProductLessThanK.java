/**
 * Created by anton on 9/11/17.
 */
public class _713SubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int start = 0;
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            while (product >= k && start < i) {
                product = product / nums[start++];
            }
            if (product < k) {
                count += i + 1 - start;
            }
        }
        return count;
    }

}
