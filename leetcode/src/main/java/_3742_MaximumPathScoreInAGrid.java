import java.util.Arrays;

public class _3742_MaximumPathScoreInAGrid {

    public int maxPathScore(int[][] grid, int k) {
//        long start = System.currentTimeMillis();
        int n = grid.length;
        int m = grid[0].length;
        int[][][] cache = new int[n][m][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(cache[i][j], -1);
            }
        }
        Arrays.fill(cache[0][0], 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int s = grid[i][j];
                int c = getCost(grid[i][j]);
                int[] scores = cache[i][j];
                if (i > 0) {
                    int[] prevScores = cache[i - 1][j];
                    for (int x = 0; x < prevScores.length - c; x++) {
                        if (prevScores[x] > -1) {
                            scores[x + c] = Math.max(prevScores[x] + s, scores[x + c]);
                        }
                    }
                }
                if (j > 0) {
                    int[] prevScores = cache[i][j - 1];
                    for (int x = 0; x < prevScores.length - c; x++) {
                        if (prevScores[x] > -1) {
                            scores[x + c] = Math.max(prevScores[x] + s, scores[x + c]);
                        }
                    }
                }
            }
        }

        int result = -1;
        for (int s : cache[n - 1][m - 1]) {
            result = Math.max(result, s);
        }
//        System.out.println("Time =" + (System.currentTimeMillis() - start) + "ms");
        return result;
    }


    private int getCost(int score) {
        if (score == 2) {
            return 1;
        }
        return score;
    }


}
