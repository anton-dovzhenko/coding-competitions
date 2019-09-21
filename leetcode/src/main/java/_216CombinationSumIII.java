import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _216CombinationSumIII {

    public static void main(String ... args) {
        List<List<Integer>> result = null;
        result = new _216CombinationSumIII().combinationSum3(3, 7);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
        System.out.println(" ---------------------------------- ");

        result = new _216CombinationSumIII().combinationSum3(3, 9);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
        System.out.println(" ---------------------------------- ");

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new LinkedList<>();
        combinationSum3(result, new ArrayList<>(), k, n, 9);
        return result;
    }

    private void combinationSum3(List<List<Integer>> result, ArrayList<Integer> list, int k, int n, int end) {
        if (k == 1) {
            if (end >= n) {
                list.add(n);
                result.add(list);
            }
            return;
        }
        for (int i = Math.min(n - 1, end); i >= 1; i--) {
            ArrayList<Integer> fit = (ArrayList<Integer>) list.clone();
            fit.add(i);
            combinationSum3(result, fit, k - 1, n - i, i - 1);
        }
    }

}