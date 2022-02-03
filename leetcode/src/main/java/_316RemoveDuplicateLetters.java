import java.util.*;

/**
 * Created by anton on 3/4/17.
 */
public class _316RemoveDuplicateLetters {

    private int[] min = new int[26];
    private int[] max = new int[26];

    public String removeDuplicateLetters(String s) {
        StringBuilder distinct = new StringBuilder();
        while (!s.isEmpty()) {
            int i = getFirstCharIndex(s);
            char c = s.charAt(i);
            StringBuilder next = new StringBuilder();
            for (int k = i + 1; k < s.length(); k++) {
                if (s.charAt(k) != c) {
                    next.append(s.charAt(k));
                }
            }
            s = next.toString();
            distinct.append(c);
        }
        return distinct.toString();
    }

    private int getFirstCharIndex(String s) {
        int minIndex = Integer.MAX_VALUE;
        Arrays.fill(min, Integer.MAX_VALUE);
        Arrays.fill(max, Integer.MIN_VALUE);
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            minIndex = Math.min(minIndex, index);
            min[index] = Math.min(min[index], i);
            max[index] = Math.max(max[index], i);
        }

        boolean isFirst = true;
        for (int i = minIndex + 1; i < 26; i++) {
            if (max[i] != Integer.MIN_VALUE && max[i] < min[minIndex]) {
                isFirst = false;
                break;
            }
        }

        if (isFirst) {
            return min[minIndex];
        } else {
            boolean[] lookup = new boolean[26];
            for (int i = 0; i < min[minIndex]; i++) {
                lookup[s.charAt(i) - 'a'] = true;
            }
            StringBuilder substring = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (lookup[s.charAt(i) - 'a']) {
                    substring.append(s.charAt(i));
                }
            }
            return getFirstCharIndex(substring.toString());
        }

    }


}
