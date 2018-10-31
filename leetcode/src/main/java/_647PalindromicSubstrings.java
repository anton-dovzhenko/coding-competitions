/**
 * Created by anton on 4/2/18.
 */
public class _647PalindromicSubstrings {

    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                boolean palindrome = true;
                for (int offset = 0; offset <= (j - i) / 2; offset++) {
                    if (s.charAt(i + offset) != s.charAt(j - offset)) {
                        palindrome = false;
                        break;
                    }
                }
                if (palindrome) {
                    count++;
                }
            }
        }
        return count;
    }

}
