import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by anton on 1/1/18.
 */
public class _76MinimumWindowSubstring2 {

    public String minWindow(String s, String t) {
        int[] tCountMap = new int[256];
        boolean[] tAvailable = new boolean[256];
        for (int i = 0; i < t.length(); i++) {
            tCountMap[t.charAt(i)]++;
            tAvailable[t.charAt(i)] = true;
        }
        int start = 0;
        int end = 0;
        int min = 0;
        int max = s.length() - 1;
        int matchCount = 0;

        while (end < s.length() || matchCount == t.length()) {
            if (matchCount != t.length()) {
                char c = s.charAt(end);
                if (tCountMap[c] > 0) {
                    matchCount++;
                }
                tCountMap[c]--;
                end++;
            } else {
                if (max - min > end - start) {
                    min = start;
                    max = end;
                }
                char c = s.charAt(++start);
                if (tAvailable[c]) {
                    matchCount--;
                    tCountMap[c]++;
                }
            }
        }

        return s.substring(min, max + 1);
    }



}
