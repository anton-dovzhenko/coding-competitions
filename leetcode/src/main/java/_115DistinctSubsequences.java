import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anton on 8/10/18.
 */
public class _115DistinctSubsequences {


    public int numDistinct(String s, String t) {
        int[] counts = new int[t.length()];
        Map<Character, List<Integer>> pointers = new HashMap<>();

        //reversed order is crucial for last loop
        for (int i = t.length() - 1; i >= 0; i--) {
            char c = t.charAt(i);
            List<Integer> indices = pointers.get(c);
            if (indices == null) {
                indices = new ArrayList<>();
                pointers.put(c, indices);
            }
            indices.add(i);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            List<Integer> indices = pointers.get(c);
            if (indices != null) {
                for (int j : indices) {
                    if (j == 0) {
                        counts[0]++;
                    } else if (counts[j - 1] > 0) {
                        counts[j] += counts[j - 1];
                    }
                }
            }
        }

        return counts[counts.length - 1];
    }

}
