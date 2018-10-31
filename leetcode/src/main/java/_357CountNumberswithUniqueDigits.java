import java.util.Arrays;

/**
 * Created by anton on 15/1/18.
 */
public class _357CountNumberswithUniqueDigits {

    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        long[] factorials = new long[11];
        factorials[0] = 1;
        for (int i = 1; i <= 10; i++) {
            factorials[i] = i * factorials[i - 1];
        }
        int count = 0;
        for (int i = 1; i <= Math.min(n, 10); i++) {
            count += factorials[10] / factorials[10 - i];
            count -= i == 1 ? 0 : factorials[9] / factorials[10 - i];
        }
        return count;
    }

}
