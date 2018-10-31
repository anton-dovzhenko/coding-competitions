import java.awt.Point;
import java.util.*;

/**
 * Created by anton on 1/1/18.
 */
public class _76MinimumWindowSubstring1 {

    public String minWindow(String s, String t) {
        int[] indices = new int[t.length()];
        Map<Character, List<Integer>> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            List<Integer> list = tMap.get(t.charAt(i));
            if (list == null) {
                list = new ArrayList<>();
                tMap.put(t.charAt(i), list);
            }
            list.add(i);
        }

        Arrays.fill(indices, -1);
        int windowLength = Integer.MAX_VALUE;
        Point p = null;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            List<Integer> tIndices = tMap.get(c);
            if (tIndices == null) {
                continue;
            }
            int indexPos = Integer.MAX_VALUE;
            int indexVal = Integer.MAX_VALUE;
            for (int j : tIndices) {
                if (t.charAt(j) == c && indices[j] < indexVal) {
                    indexVal = indices[j];
                    indexPos = j;
                }
            }
            if (indexPos != Integer.MAX_VALUE) {
                indices[indexPos] = i;
                Point nextWindow = windowLength(indices);
                int nextWindowLength = nextWindow.y - nextWindow.x;
                if (nextWindowLength < windowLength) {
                    windowLength = nextWindowLength;
                    p = nextWindow;
                }
            }
        }
        if (windowLength == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(p.x, p.y + 1);
    }

    private Point windowLength(int[] indices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int index : indices) {
            if (index == -1) {
                return new Point(0, Integer.MAX_VALUE);
            }
            min = Math.min(min, index);
            max = Math.max(max, index);
        }
        return new Point(min, max);
    }

}
