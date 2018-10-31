import java.util.Set;

/**
 * Created by anton on 13/1/17.
 */
public class _50PowXN {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n == Integer.MIN_VALUE) {
            return myPow(1 / x, Integer.MAX_VALUE) / x;
        }
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        return myPow(x * x, n / 2) * (n % 2 == 0 ? 1 : x);
    }

    public double myPowNaive(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        double result = x;
        for (int i = 1; i < n; i++) {
            result *= x;
        }
        return result;
    }

}
