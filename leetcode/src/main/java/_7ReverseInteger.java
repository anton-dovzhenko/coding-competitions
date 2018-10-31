/**
 * Created by anton on 12/1/17.
 */
public class _7ReverseInteger {

    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        int sign = (int) Math.signum(x);
        x = Math.abs(x);
        int length = (int) Math.log10(x);
        long reverse = 0;
        for (int i = 0; i <= length; i++) {
            int digit = x % 10;
            x = x / 10;
            reverse += digit * Math.pow(10, length - i);
        }
        reverse *= sign;
        if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
            reverse = 0;
        }
        return (int) reverse;
    }

}
