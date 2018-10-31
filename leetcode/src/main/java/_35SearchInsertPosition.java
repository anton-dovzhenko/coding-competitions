/**
 * Created by anton on 13/2/17.
 */
public class _35SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        int low = 0;
        int high = nums.length - 1;
        int index = 0;
        while (true) {
            index = (low + high) / 2;
            if (nums[index] == target) {
                break;
            } else if (nums[index] < target) {
                low = index;
            } else {
                high = index;
            }
            if (low + 1 == high) {
                index = high;
                break;
            }
        }
        for (int i = index - 1; i >= 0; i--) {
            if (nums[i] == target) {
                index = i;
            } else {
                break;
            }
        }
        return index;
    }
}
