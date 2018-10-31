/**
 * Created by anton on 21/1/18.
 */
public class _130SurroundedRegions {

    public void solve(char[][] board) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'O') {
                    if (!touchBoundary(board, visited, i, j)) {
                        fillWithX(board, i, j);
                    }
                }
            }
        }
    }

    private void fillWithX(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || board[i][j] == 'X') {
            return;
        }
        board[i][j] = 'X';
        fillWithX(board, i - 1, j);
        fillWithX(board, i, j - 1);
        fillWithX(board, i + 1, j);
        fillWithX(board, i, j + 1);
    }

    private boolean touchBoundary(char[][] board, boolean[][] visited, int i, int j) {
        if (visited[i][j]) {
            return false;
        }
        visited[i][j] = true;
        if (board[i][j] == 'X') {
            return false;
        }
        if (i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1) {
            return true;
        }
        return touchBoundary(board, visited, i - 1, j)
                || touchBoundary(board, visited, i, j - 1)
                || touchBoundary(board, visited, i + 1, j)
                || touchBoundary(board, visited, i, j + 1);
    }

}
