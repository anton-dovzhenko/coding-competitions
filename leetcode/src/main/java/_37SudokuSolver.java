public class _37SudokuSolver {

    public void solveSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] squares = new boolean[9][9];
        int undefined = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    rows[i][c - '1'] = true;
                    cols[j][c - '1'] = true;
                    squares[3 * (i / 3) + j / 3][c - '1'] = true;
                } else {
                    undefined++;
                }
            }
        }
        boolean solved = solveSudoku(board, rows, cols, squares, undefined);
        if (!solved) {
            throw new IllegalStateException("Sudoku puzzle solution not found");
        }
    }

    private boolean solveSudoku(char[][] board, boolean[][] rows, boolean[][] cols, boolean[][] squares, int undefined) {
        int defined = 0;
        int minOpsCount = Integer.MAX_VALUE;
        int[] minCell = null;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') {
                    int optionsCount = 0;
                    int lastOption = -1;
                    for (int k = 0; k < 9; k++) {
                        if (!rows[i][k] && !cols[j][k] && !squares[3 * (i / 3) + j / 3][k]) {
                            optionsCount++;
                            lastOption = k;
                        }
                    }
                    if (optionsCount == 0) {
                        return false;
                    }

                    if (optionsCount < minOpsCount) {
                        minOpsCount = optionsCount;
                        minCell = new int[] {i, j};
                    }

                    if (optionsCount == 1) {
                        defined++;
                        undefined--;
                        board[i][j] = (char) ('1' + lastOption);
                        rows[i][lastOption] = true;
                        cols[j][lastOption] = true;
                        squares[3 * (i / 3) + j / 3][lastOption] = true;
                    }
                }
            }
        }
        if (undefined == 0) {
            return true;
        }
        if (defined > 0) {
            return solveSudoku(board, rows, cols, squares, undefined);
        } else {
            int i = minCell[0];
            int j = minCell[1];
            for (int k = 0; k < 9; k++) {
                if (!rows[i][k] && !cols[j][k] && !squares[3 * (i / 3) + j / 3][k]) {
                    char[][] b = deepCopy(board);
                    boolean[][] r = deepCopy(rows);
                    boolean[][] c = deepCopy(cols);
                    boolean[][] s = deepCopy(squares);

                    char option = (char) ('1' + k);
                    b[i][j] = option;
                    r[i][k] = true;
                    c[j][k] = true;
                    s[3 * (i / 3) + j / 3][k] = true;

                    boolean solved = solveSudoku(b, r, c, s, undefined - 1);
                    if (solved) {
                        deepCopy(b, board);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private void deepCopy(char[][] from, char[][] to) {
        for (int i = 0; i < from.length; i++) {
            for (int j = 0; j < from[i].length; j++) {
                to[i][j] = from[i][j];
            }
        }
    }

    private char[][] deepCopy(char[][] m) {
        char[][] copy = new char[m.length][];
        for (int i = 0; i < m.length; i++) {
            copy[i] = new char[m[i].length];
            for (int j = 0; j < m[i].length; j++) {
                copy[i][j] = m[i][j];
            }
        }
        return copy;
    }

    private boolean[][] deepCopy(boolean[][] m) {
        boolean[][] copy = new boolean[m.length][];
        for (int i = 0; i < m.length; i++) {
            copy[i] = new boolean[m[i].length];
            for (int j = 0; j < m[i].length; j++) {
                copy[i][j] = m[i][j];
            }
        }
        return copy;
    }

}