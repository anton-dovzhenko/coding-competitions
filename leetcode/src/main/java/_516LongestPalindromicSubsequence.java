/**
 * Created by anton on 9/2/18.
 */
public class _516LongestPalindromicSubsequence {

    public int longestPalindromeSubseq(String s) {
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            length = Math.max(length, getCentreLength(s, i));
            length = Math.max(length, getLeftLength(s, i));
        }
        return length;
    }

    private int getCentreLength(String s, int i) {
        int length = 1;
        for (int j = 1; j <= Math.min(i, s.length() - i - 1); j++) {
            if (s.charAt(i - j) == s.charAt(i + j)) {
                length += 2;
            } else {
                break;
            }
        }
        return length;
    }

    private int getLeftLength(String s, int i) {
        int length = 0;
        for (int j = 1; j <= Math.min(i, s.length() - i - 1); j++) {
            if (s.charAt(i - j + 1) == s.charAt(i + j)) {
                length += 2;
            }
        }
        return length;
    }
    // 0 1 2 3 4 5 6 7 ->8
}
