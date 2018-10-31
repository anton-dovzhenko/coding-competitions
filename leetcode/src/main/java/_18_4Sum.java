import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by anton on 12/2/17.
 */
public class _18_4Sum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int ij = nums[i] + nums[j];
                if (ij + nums[j + 1]  + nums[j + 2] > target) {
                    break;
                }
                for (int k = j + 1; k < nums.length - 1; k++) {
                    int ijk = ij + nums[k];
                    int index = Arrays.binarySearch(nums, k + 1, nums.length, target - ijk);
                    if (index > -1) {
                        List<Integer> sum = Arrays.asList(nums[i], nums[j], nums[k], nums[index]);
                        if (result.isEmpty() || !result.get(result.size() - 1).equals(sum)) {
                            result.add(sum);
                        }
                    } else if (index < -nums.length - 1){
                        break;
                    }
                }
            }
        }
        return result;
    }
}
