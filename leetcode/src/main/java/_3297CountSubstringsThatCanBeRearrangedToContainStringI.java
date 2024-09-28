import java.util.Arrays;

public class _3297CountSubstringsThatCanBeRearrangedToContainStringI {

    public long validSubstringCount(String word1, String word2) {
        long result = 0;
        int[] prefix = new int[26];
        Arrays.fill(prefix, Integer.MIN_VALUE);
        for (char c : word2.toCharArray()) {
            int pos = c - 'a';
            prefix[pos] = prefix[pos] == Integer.MIN_VALUE ? 1 : prefix[pos] + 1;
        }

        int start = 0;
        int end = 0;
        while (true) {
            if (isGoodPrefix(prefix)) {
                result += word1.length() - end + 1;
                int c = word1.charAt(start) - 'a';
                if (prefix[c] > Integer.MIN_VALUE) {
                    prefix[c]++;
                }
                start++;
            } else {
                if (end == word1.length()) {
                    break;
                }
                int c = word1.charAt(end) - 'a';
                if (prefix[c] > Integer.MIN_VALUE) {
                    prefix[c]--;
                }
                end++;
            }
        }
        if (isGoodPrefix(prefix)) {
            result += 1;
        }
        return result;
    }

    private boolean isGoodPrefix(int[] prefix) {
        for (int cnt : prefix) {
            if (cnt > 0) {
                return false;
            }
        }
        return true;
    }

}
