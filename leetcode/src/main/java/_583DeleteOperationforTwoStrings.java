import java.awt.*;
import java.util.*;
import java.util.List;

public class _583DeleteOperationforTwoStrings {

    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                dp[i + 1][j + 1] = word1.charAt(i) == word2.charAt(j) ? 1 + dp[i][j] : Math.max(dp[i + 1][j], dp[i][j + 1]);
            }
        }
        int matches = dp[word1.length()][word2.length()];
        return word1.length() + word2.length() - 2 * matches;
    }

    // first solution - slower and more complicated
    public int minDistance0(String word1, String word2) {
        // word1 is always shorter than word 2
        if (word2.length() < word1.length()) {
            String tmp = word2;
            word2 = word1;
            word1 = tmp;
        }

        Map<Point, Integer> cache = new HashMap<>();
        Map<Character, List<Integer>> w2 = new HashMap<>();
        for (int i = 0; i < word2.length(); i++) {
            char c = word2.charAt(i);
            List<Integer> l = w2.get(c);
            if (l == null) {
                l = new ArrayList<>();
                w2.put(c, l);
            }
            l.add(i);
        }
        int matches = countMatches(cache, word1, w2, 0, 0);
        return word1.length() + word2.length() - 2 * matches;
    }

    private int countMatches(Map<Point, Integer> cache, String word1, Map<Character, List<Integer>> w2, int i1, int i2) {
        if (i1 == word1.length()) {
            return 0;
        }

        Point point = new Point(i1, i2);
        if (cache.containsKey(point)) {
            return cache.get(point);
        }

        int matches = 0;
        for (int i = i1; i < word1.length(); i++) {
            char c = word1.charAt(i);
            List<Integer> l = w2.get(c);
            if (l == null || l.get(l.size() - 1) < i2) {
                continue;
            }
            int index = Collections.binarySearch(l, i2);
            if (index < 0) {
                index = -(index + 1);
            }
            matches = Math.max(matches, 1 + countMatches(cache, word1, w2, i + 1, l.get(index) + 1));

        }
        cache.put(point, matches);
        return matches;
    }

}
