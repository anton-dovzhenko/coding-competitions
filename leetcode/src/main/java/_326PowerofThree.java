/**
 * Created by anton on 31/1/18.
 */
public class _326PowerofThree {

    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        while (n % 3 == 0 && n > 0) {
            n = n / 3;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}
