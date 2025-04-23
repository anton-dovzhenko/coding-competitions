import java.math.BigInteger;
import java.util.Arrays;

public class _3524FindXValueOfArrayI {

    public long[] resultArray(int[] nums, int k) {
        long[][] dp = new long[nums.length][k];
        long[] result = new long[k];
        for (int i = 0; i < nums.length; i++) {
            dp[i][nums[i] % k] += 1;
            if (i > 0) {
                for (int j = 0; j < k; j++) {
                   dp[i][(j * (nums[i] % k)) % k] += dp[i - 1][j];
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < k; j++) {
                result[j] += dp[i][j];
            }
        }
        return result;
    }

    //N.B.: simple solution
    public long[] resultArray2(int[] nums, int k) {
        long[] result = new long[k];
        for (int i = 0; i < nums.length; i++) {
            int m = 1;
            for (int j = i; j < nums.length; j++) {
                m = (m * (nums[j] % k)) % k;
                if (m == 0) {
                    result[m] += (nums.length - j);
                    break;
                } else {
                    result[m] += 1;
                }
            }
        }
        return result;
    }

}
