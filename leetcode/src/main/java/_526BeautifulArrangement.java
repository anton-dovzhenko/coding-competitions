import static java.lang.Math.max;
import static java.lang.Math.sqrt;

/**
 * Created by anton on 20/2/17.
 */
public class _526BeautifulArrangement {

    public int countArrangement(int N) {
        int result = 0;
        int ones = 1;
        for (int i = 1; i <= N; i++) {
            int prevResult = result;
            result += ones;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    result += prevResult + 1;
                    ones *= 2;
                }
            }
        }

        return result;
    }


    public int countArrangement2(int N) {
        int result = 1;
        for (int i = 1; i <= N; i++) {
            result *= N / i;
        }
        return result;
    }


}
