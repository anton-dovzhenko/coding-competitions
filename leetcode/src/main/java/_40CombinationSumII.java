import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _40CombinationSumII {

    public static void main(String... args) {
        List<List<Integer>> result = null;
        result = new _40CombinationSumII().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
        System.out.println(" ---------------------------------- ");

        result = new _40CombinationSumII().combinationSum2(new int[]{2, 5, 2, 1, 2}, 5);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
        System.out.println(" ---------------------------------- ");

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new LinkedList<>();
        combinationSum2(result, new ArrayList<>(), candidates, target, candidates.length - 1);
        return result;
    }

    private void combinationSum2(List<List<Integer>> result, ArrayList<Integer> list, int[] candidates, int target, int end) {

        for (int i = end; i >= 0; i--) {

            if (candidates[i] <= target) {
                ArrayList<Integer> fit = (ArrayList<Integer>) list.clone();
                int c = candidates[i];
                fit.add(c);

                if (candidates[i] == target) {
                    result.add(fit);
                } else {
                    combinationSum2(result, fit, candidates, target - candidates[i], i - 1);
                }

                while (i > 0 && candidates[i - 1] == c) {
                    i--;
                }
            }
        }

    }

}