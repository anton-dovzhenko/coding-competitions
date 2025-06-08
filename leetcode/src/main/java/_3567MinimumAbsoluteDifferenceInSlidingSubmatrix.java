import java.util.TreeMap;

public class _3567MinimumAbsoluteDifferenceInSlidingSubmatrix {

    public int[][] minAbsDiff(int[][] grid, int k) {
        int N = grid.length - k + 1;
        int M = grid[0].length - k + 1;
        int[][] diffs = new int[N][M];
        for (int m = 0; m < M; m++) {
            TreeMap<Integer, Integer> cache = new TreeMap<>();
            for (int i = 0; i < k; i++) {
                for (int j = m; j < m + k; j++) {
                    cache.put(grid[i][j], cache.getOrDefault(grid[i][j], 0) + 1);
                }
            }
            diffs[0][m] = getMin(cache);
            for (int n = 1; n < N; n++) {
                for (int j = m; j < m + k; j++) {
                    int add = grid[n + k - 1][j];
                    int rem = grid[n - 1][j];
                    cache.put(add, cache.getOrDefault(add, 0) + 1);
                    cache.put(rem, cache.getOrDefault(rem, 0) - 1);
                    if (cache.get(rem) == 0) {
                        cache.remove(rem);
                    }
                }
                diffs[n][m] = getMin(cache);
            }
        }
        return diffs;
    }

    private int getMin(TreeMap<Integer, Integer> cache) {
        if (cache.size() <= 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        Integer prev = null;
        for (Integer i : cache.keySet()) {
            if (prev != null) {
                min = Math.min(min, i - prev);
            }
            prev = i;
        }
        return min;
    }

}
