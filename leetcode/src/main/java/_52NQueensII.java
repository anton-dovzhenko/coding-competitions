public class _52NQueensII {

    public int totalNQueens(int n) {
        return solveNQueens(n, 0, new int[n][n]);
    }

    private int solveNQueens(int n, int row, int[][] used) {
        if (row == n) {
            return 1;
        }
        int solutions = 0;
        for (int j = 0; j < n; j++) {
            if (used[row][j] == 0) {
                incrementBoard(used, row, j, n, 1);
                solutions += solveNQueens(n, row + 1, used);
                incrementBoard(used, row, j, n, -1);
            }
        }
        return solutions;
    }

    private void incrementBoard(int[][] used, int row, int j, int n, int inc) {
        used[row][j] += inc;
        for (int i = row + 1; i < n; i++) {
            used[i][j]+= inc;
            if (j + (i - row) < n) {
                used[i][j + (i - row)]+= inc;
            }
            if (j - (i - row) > -1) {
                used[i][j - (i - row)]+= inc;
            }
        }
    }

}
