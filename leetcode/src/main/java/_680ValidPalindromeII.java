/**
 * Created by anton on 11/11/17.
 */
public class _680ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int leftShift = 0;
        int rightShift = 0;
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            int l = i + leftShift;
            int r = length - 1 - i - rightShift;
            if (s.charAt(l) != s.charAt(r)) {
                if (leftShift + rightShift == 0) {
                    if (l + 1 == r) {
                        leftShift++;
                    } else if (s.charAt(l + 1) == s.charAt(r) && s.charAt(l + 2) == s.charAt(r - 1)) {
                        leftShift++;
                    } else if (s.charAt(l) == s.charAt(r - 1) && s.charAt(l + 1) == s.charAt(r - 2)) {
                        rightShift++;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
