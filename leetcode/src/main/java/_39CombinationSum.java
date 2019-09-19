import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _39CombinationSum {

    public static void main(String ... args) {

        List<List<Integer>> result = null;

        result = new _39CombinationSum().combinationSum(new int[] {2,3,6,7}, 7);
        for (List<Integer> list : result) {
            System.out.println(list);
        }

        System.out.println(" ------------------------------------------ ");

        result = new _39CombinationSum().combinationSum(new int[] {2,3,5}, 8);
        for (List<Integer> list : result) {
            System.out.println(list);
        }

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new LinkedList<>();
        combinationSum(result, new ArrayList<>(), candidates, target, candidates.length - 1);
        return result;
    }

    private void combinationSum(List<List<Integer>> result, ArrayList<Integer> list, int[] candidates, int target, int end) {
        for (int i = end; i >= 0; i--) {
            if (candidates[i] <= target) {
                ArrayList<Integer> fit = (ArrayList<Integer>) list.clone();
                fit.add(candidates[i]);
                if (candidates[i] == target) {
                    result.add(fit);
                } else {
                    combinationSum(result, fit, candidates, target - candidates[i], i);
                }
            }
        }
    }

}