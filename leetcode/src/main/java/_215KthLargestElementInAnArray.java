import java.util.Arrays;

/**
 * Created by anton on 25/2/17.
 */
public class _215KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

}
