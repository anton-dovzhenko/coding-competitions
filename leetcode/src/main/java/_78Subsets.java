import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by anton on 18/3/17.
 */
public class _78Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        next(result, nums, 0);
        return result;
    }

    private void next(List<List<Integer>> result, int[] nums, int offset) {
        if (offset == nums.length) {
            return;
        }
        int num = nums[offset];
        List<List<Integer>> nextResult = new ArrayList<>();
        for (List<Integer> list : result) {
            List<Integer> copy = new ArrayList<>(list);
            copy.add(num);
            nextResult.add(copy);
        }
        result.addAll(nextResult);
        next(result, nums, ++offset);
    }

}
