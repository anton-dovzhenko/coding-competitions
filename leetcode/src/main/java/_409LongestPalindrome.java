/**
 * Created by anton on 16/11/17.
 */
public class _409LongestPalindrome {

    public int longestPalindrome(String s) {
        int longest = 0;
        int[] charCount = new int[256];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
        }

        for (int i = 0; i < charCount.length; i++) {
            longest += charCount[i] / 2 * 2;
        }
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] % 2 == 1) {
                longest += 1;
                break;
            }
        }
        return longest;
    }

}
