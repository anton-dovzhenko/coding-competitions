import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 5/9/18.
 */
public class _32LongestValidParentheses {


    public int longestValidParentheses(String s) {
        int length = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int increment = s.charAt(i) == '(' ? 1 : -1;
            sum += increment;

            if (increment == 1 && !map.containsKey(sum)) {
                map.put(sum, i);
            }

            if (increment == -1) {
                map.remove(sum + 2);
                Integer match = map.get(sum + 1);
                if (match != null) {
                    length = Math.max(length, i - match + 1);
                }
            }

        }
        return length;
    }

}
