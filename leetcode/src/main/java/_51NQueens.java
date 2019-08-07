import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 15/3/17.
 */
public class _51NQueens {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new LinkedList<>();
        LinkedList<Integer> queens = new LinkedList<>();
        int[][] used = new int[n][n];
        solveNQueens(n, 0, used, queens, solutions);
        return solutions;
    }

    private void solveNQueens(int n, int row, int[][] used, LinkedList<Integer> queens, List<List<String>> solutions) {
        if (row == n) {
            List<String> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                char[] sublist = new char[n];
                Arrays.fill(sublist, '.');
                sublist[queens.get(i)] = 'Q';
                list.add(new String(sublist));
            }
            solutions.add(list);
            return;
        }

        for (int j = 0; j < n; j++) {
            if (used[row][j] == 0) {
                queens.add(j);
                incrementBoard(used, row, j, n, 1);
                solveNQueens(n, row + 1, used, queens, solutions);
                queens.removeLast();
                incrementBoard(used, row, j, n, -1);
            }
        }
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
