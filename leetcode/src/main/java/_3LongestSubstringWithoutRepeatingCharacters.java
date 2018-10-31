import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 4/2/17.
 */
public class _3LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> syms = new HashMap<>();
        int max = 0;
        int currentLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer index = syms.get(c);
            if (index != null) {
                if (i - currentLength - 1 <= index) {
                    if (currentLength > max) {
                        max = currentLength;
                    }
                    currentLength = i - index - 1;
                }
            }
            currentLength++;
            syms.put(c, i);
        }
        if (currentLength > max) {
            max = currentLength;
        }
        return max;
    }

}
