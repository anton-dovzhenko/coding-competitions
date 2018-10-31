/**
 * Created by anton on 12/3/18.
 */
public class _397IntegerReplacement {

    public int integerReplacement(int n) {
        return integerReplacement2(n);
    }

    public int integerReplacement2(long n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return 1 + integerReplacement2(n / 2);
        } else {
            if ((n + 1) % 4 == 0 && n > 3) {
                return 1 + (integerReplacement2(n + 1));
            } else {
                return 1 + integerReplacement2(n - 1);
            }
        }
    }
}
