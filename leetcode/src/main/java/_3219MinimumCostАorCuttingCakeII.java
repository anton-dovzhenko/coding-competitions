import java.util.Arrays;

public class _3219MinimumCostАorCuttingCakeII {

    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        int M = m - 1;
        int N = n - 1;
        int hi = 0;
        int vi = 0;
        long cost = 0;
        while (hi + vi < M + N) {
            if (hi == M && vi < N) {
                cost += verticalCut[N - 1 - vi] * (hi + 1);
                vi++;
            } else if (hi < M && vi == N) {
                cost += horizontalCut[M - 1 - hi] * (vi + 1);
                hi++;
            } else {
                if (horizontalCut[M - 1 - hi] >= verticalCut[N - 1 - vi]) {
                    cost += horizontalCut[M - 1 - hi] * (vi + 1);
                    hi++;
                } else {
                    cost += verticalCut[N - 1 - vi] * (hi + 1);
                    vi++;
                }
            }
        }
        return cost;
    }
}
