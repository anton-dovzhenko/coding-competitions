/**
 * Created by anton on 6/2/18.
 */
public class _263UglyNumber {

    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        int divisor = 2;
        while (num > 1 && divisor <= 5) {
            if (num % divisor == 0) {
                num /= divisor;
            } else {
                divisor++;
            }
        }
        return divisor <= 5;
    }
}
