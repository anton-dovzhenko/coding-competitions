import java.util.*;

/**
 * Created by anton on 23/4/18.
 */
public class _718MaximumLengthOfRepeatedSubarray {

    public int findLength2(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m == 0 || n == 0) {
            return 0;
        }
        int[][] dp = new int[m + 1][n + 1];
        int max = 0;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                max = Math.max(max, dp[i][j] = A[i] == B[j] ? 1 + dp[i + 1][j + 1] : 0);
            }
        }
        for (int i = 0; i <= m ; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(dp[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        return max;
    }

    public int findLength(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m == 0 || n == 0) {
            return 0;
        }
        int[][] dp = new int[m + 1][n + 1];
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i + 1][j + 1] = A[i] == B[j] ? 1 + dp[i][j] : 0;
                max = Math.max(max, dp[i + 1][j + 1]);
            }
        }
        return max;
    }


}
