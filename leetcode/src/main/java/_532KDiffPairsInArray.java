import java.util.Arrays;

/**
 * Created by anton on 5/3/17.
 */
public class _532KDiffPairsInArray {

    public int findPairs(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                    continue;
                }
                int val = nums[j] - nums[i];
                if (val == k) {
                    count++;
                } else if (val > k) {
                    break;
                }
            }
        }
        return count;
    }

}
