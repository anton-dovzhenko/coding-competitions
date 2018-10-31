/**
 * Created by anton on 14/10/18.
 */
public class _214ShortestPalindrome {

    public String shortestPalindrome0(String s) {
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == s.charAt(j))
                j++;
        }
        if (j == s.length())
            return s;
        String suffix = s.substring(j);
        System.out.println(suffix);
        return new StringBuilder(suffix).reverse().toString() + shortestPalindrome(s.substring(0, j)) + suffix;

    }

    public String shortestPalindrome(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int start = 0;
            int end = i;
            boolean palindrome = true;
            while (palindrome && start < end) {
                if (s.charAt(start) != s.charAt(end)) {
                    palindrome = false;
                }
                start++;
                end--;
            }
            if (palindrome) {
                length = i + 1;
                break;
            }
        }
        String shortest = s;
        if (length != s.length()) {
            shortest = new StringBuilder(s.substring(length)).reverse().toString() + shortest;
        }
        return shortest;
    }

}
