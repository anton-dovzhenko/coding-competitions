/**
 * Created by anton on 17/10/18.
 */
public class _154_FindMinimuminRotatedSortedArrayII {

    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length - 1);
    }

    public int findMin(int[] nums, int s, int e) {
        if (e - s <= 1) {
            return Math.min(nums[s], nums[e]);
        }
        int m = (s + e) / 2;
        if (nums[s] < nums[e]) {
            return nums[s];
        } else if (nums[s] == nums[e]) {
            return Math.min(findMin(nums, s, m), findMin(nums, 1 + m, e));
        } else {
            if (nums[m] <= nums[e]) {
                return findMin(nums, s, m);
            } else {
                return findMin(nums, m, e);
            }
        }
    }

}
