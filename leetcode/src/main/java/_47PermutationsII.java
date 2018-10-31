import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 20/8/17.
 */
public class _47PermutationsII {

    private final List<List<Integer>> nextPermutations = new LinkedList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        next(nums, 0, new ArrayList<>());
        return nextPermutations;
    }

    private void next(int[] nums, int index, List<Integer> permutation) {
        if (index == nums.length) {
            nextPermutations.add(permutation);
            return;
        }
        int num = nums[index];
        int start = Math.max(0, permutation.size() - 1);
        while (start > 0 && permutation.get(start) != num) {
            start--;
        }
        for (int i = start; i <= permutation.size(); i++) {
            if (i < permutation.size() && permutation.get(i) != num) {
                List<Integer> copy = new ArrayList<>(permutation);
                copy.add(i, num);
                next(nums, index + 1, copy);
            } else if (i == permutation.size()) {
                List<Integer> copy = new ArrayList<>(permutation);
                copy.add(num);
                next(nums, index + 1, copy);
            }
        }
    }

}
