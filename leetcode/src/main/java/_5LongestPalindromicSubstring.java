/**
 * Created by anton on 5/2/17.
 */
public class _5LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                int length = 2;
                for (int j = 1; j <= Math.min(i, s.length() - i - 2); j++) {
                    if (s.charAt(i - j) == s.charAt(i + 1 + j)) {
                        length += 2;
                    } else {
                        break;
                    }
                }
                if (length > max) {
                    max = length;
                    start = i + 1 - length / 2;
                }
            }
            if (i < s.length() - 1 && i > 0 && s.charAt(i - 1) == s.charAt(i + 1)) {
                int length = 3;
                for (int j = 2; j <= Math.min(i, s.length() - i - 1); j++) {
                    if (s.charAt(i - j) == s.charAt(i + j)) {
                        length += 2;
                    } else {
                        break;
                    }
                }
                if (length > max) {
                    max = length;
                    start = i - length / 2;
                }
            }
        }
        if (max == 0) {
            return s.length() > 0 ? s.substring(0, 1) : "";
        } else {
            return s.substring(start, start + max);
        }
    }


}
