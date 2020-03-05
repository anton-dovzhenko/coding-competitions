public class _63UniquePathsII {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[] array = new int[m];
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            array[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            if (obstacleGrid[i][0] == 1) {
                array[0] = 0;
            }
            for (int j = 1; j < m; j++) {
                if (obstacleGrid[i][j] == 1) {
                    array[j] = 0;
                } else {
                    array[j] += array[j - 1];
                }
            }
        }
        return array[m - 1];
    }

}
