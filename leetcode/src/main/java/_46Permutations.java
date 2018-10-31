import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 9/2/17.
 */
public class _46Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> nextPermutations = new ArrayList<>();
        nextPermutations.add(new ArrayList<>());
        return permute(nums, 0, nextPermutations);
    }

    public List<List<Integer>> permute(int[] nums, int index, List<List<Integer>> permutations) {
        if (index == nums.length) {
            return permutations;
        }
        int value = nums[index];
        List<List<Integer>> nextPermutations = new ArrayList<>(permutations.size() * (permutations.size() + 1));
        for (int i = 0; i <= index; i++) {
            for (List<Integer> permutation : permutations) {
                List<Integer> nextPermutation = new ArrayList<>(permutation.size() + 1);
                nextPermutation.addAll(permutation.subList(0, i));
                nextPermutation.add(value);
                nextPermutation.addAll(permutation.subList(i, permutation.size()));
                nextPermutations.add(nextPermutation);
            }
        }
        return permute(nums, ++index, nextPermutations);
    }

}
