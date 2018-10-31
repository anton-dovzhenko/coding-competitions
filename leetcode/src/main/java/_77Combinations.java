import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by anton on 15/1/17.
 */
public class _77Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        combinations.add(new ArrayList<>());
        for (int i = 0; i < k; i++) {
            List<List<Integer>> nextCombinations = new ArrayList<>();
            for (List<Integer> combination : combinations) {
                int start = combination.size() == 0 ? 0 : combination.get(combination.size() - 1);
                for (int j = start + 1; j <= n - k + i + 1; j++) {
                    List<Integer> nextCombination = new ArrayList<>(k);
                    nextCombination.addAll(combination);
                    nextCombination.add(j);
                    nextCombinations.add(nextCombination);
                }
            }
            combinations = nextCombinations;
        }
        return combinations;
    }

}
