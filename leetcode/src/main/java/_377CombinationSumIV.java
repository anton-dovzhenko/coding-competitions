import java.util.Arrays;

/**
 * Created by anton on 14/5/18.
 */
public class _377CombinationSumIV {

    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        return combinationSum4(nums, target, 0);
    }

    private int combinationSum4(int[] nums, int target, int offset) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = offset; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            } else if (nums[i] < target) {
                count += combinationSum4(nums, target - nums[i], i + 1);
            } else {
                break;
            }
        }
        return count;
    }
}
