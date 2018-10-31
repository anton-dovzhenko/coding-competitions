import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 6/5/18.
 */
public class _829ConsecutiveNumbersSum {

    public int consecutiveNumbersSum(int N) {
        int sum = 0;
        for (int i = 1; i <= N / 2 + 1; i++) {
            double start = ((double) N) / i - (i - 1) / 2f;
            if (start <= 0) {
                break;
            }
            if (start % 1 == 0) {
                sum++;
            }

        }
        return sum;
    }

}
