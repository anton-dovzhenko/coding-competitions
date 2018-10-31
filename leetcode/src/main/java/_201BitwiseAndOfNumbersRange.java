import java.util.Arrays;

/**
 * Created by anton on 3/9/17.
 */
public class _201BitwiseAndOfNumbersRange {

    public int rangeBitwiseAnd(int m, int n) {
        int[] resultBits = new int[32];
        int index = 0;
        while (m > 0) {
            resultBits[index] = (m % 2 == 0 || m % 2 != 0 && n > m) ? 0 : 1;
            m = m / 2;
            n = n / 2;
            index++;
        }
        int result = 0;
        for (int i = 0; i < resultBits.length; i++) {
            result += resultBits[i] * Math.pow(2, i);
        }
        return result;
    }

}
