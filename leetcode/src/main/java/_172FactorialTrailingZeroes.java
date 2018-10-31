/**
 * Created by anton on 23/1/18.
 */
public class _172FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int zeroes = 0;
        do {
            n = n / 5;
            zeroes += n;
        } while (n != 0);
        return zeroes;
    }

}
