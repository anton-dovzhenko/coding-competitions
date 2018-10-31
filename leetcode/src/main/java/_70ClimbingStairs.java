/**
 * Created by anton on 13/3/18.
 */
public class _70ClimbingStairs {

    public int climbStairs(int n) {
        int paths = 0;
        for (int i = 0; i <= n / 2; i++) {
            paths += c(n - i, i);
        }
        return paths;
    }

    private int c(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        long v = 1;
        for (int i = 1 + n - k; i <= n; i++) {
            v *= i;
            v /= i - (n - k);
        }
        return (int) v;
    }

}
