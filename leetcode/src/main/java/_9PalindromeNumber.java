/**
 * Created by anton on 13/1/17.
 */
public class _9PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String number = Integer.toString(x);
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeSlow(int x) {
        if (x < 0) {
            return false;
        }
        int copyX = x;
        long reverse = 0;
        while (copyX > 0) {
            reverse = reverse * 10 + copyX % 10;
            copyX = (int) (copyX * 0.1);
        }
        return reverse == x;
    }

}
