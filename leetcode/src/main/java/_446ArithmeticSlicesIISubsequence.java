import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by anton on 19/2/18.
 */
public class _446ArithmeticSlicesIISubsequence {

    public int numberOfArithmeticSlices(int[] A) {
        int count = 0;
        Map<Integer, Integer> numMap = new HashMap<>();
        Map<Integer, Set<Integer>> stepMap = new HashMap<>();
        for (int a : A) {
            numMap.put(a, 1 + numMap.getOrDefault(a, 0));
        }
        for (int i = 0; i < A.length - 2; i++) {
            for (int j = i + 1; j < A.length - 1; j++) {
                int step = A[j] - A[i];
                int length = 2;
                int target = A[j] + step;
                //while (nu)
            }
        }
        return count;
    }

    // -12 -4 0 1 2 3 4 12 20 6 8
}

