/**
 * Created by anton on 27/8/17.
 */
public class _125ValidPalindrome {

    public boolean isPalindrome(String s) {
        int begin = 0;
        int end = s.length() - 1;
        while (begin < end) {
            char b = s.charAt(begin);
            char e = s.charAt(end);
            if (!Character.isLetterOrDigit(b)) {
                begin++;
            } else if (!Character.isLetterOrDigit(e)) {
                end--;
            } else if (Character.toLowerCase(b) != Character.toLowerCase(e)) {
                return false;
            } else {
                begin++;
                end--;
            }
        }
        return true;
    }

}
