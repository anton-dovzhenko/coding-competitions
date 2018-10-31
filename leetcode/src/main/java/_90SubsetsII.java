import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by anton on 18/3/17.
 */
public class _90SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
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
        int repetitions = 1;
        for (int i = offset + 1; i < nums.length && num == nums[i]; i++) {
            repetitions++;
        }
        List<List<Integer>> nextResult = new ArrayList<>();
        for (List<Integer> list : result) {
            for (int rep = 1; rep <= repetitions; rep++) {
                List<Integer> copy = new ArrayList<>(list);
                copy.addAll(Collections.nCopies(rep, num));
                nextResult.add(copy);
            }
        }
        result.addAll(nextResult);
        next(result, nums, offset + repetitions);
    }

}
