/**
 * Created by anton on 3/4/17.
 */
public class _289GameOfLife {

    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int liveNeighbours = 0;
                liveNeighbours += addLiveNeighbour(board,i - 1, j - 1);
                liveNeighbours += addLiveNeighbour(board,i - 1, j);
                liveNeighbours += addLiveNeighbour(board,i - 1, j + 1);
                liveNeighbours += addLiveNeighbour(board,i, j - 1);
                liveNeighbours += addLiveNeighbour(board,i, j + 1);
                liveNeighbours += addLiveNeighbour(board,i + 1, j - 1);
                liveNeighbours += addLiveNeighbour(board,i + 1, j);
                liveNeighbours += addLiveNeighbour(board,i + 1, j + 1);
                if (liveNeighbours == 0) {
                    liveNeighbours = 8;
                }
                board[i][j] = liveNeighbours * (board[i][j] > 0 ? 1 : -1);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int val = board[i][j];
                if (val >= 2 && val <= 3 || val == -3) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }
            }
        }
    }

    private int addLiveNeighbour(int[][] board, int i, int j) {
        if (i >= 0 && i < board.length && j >= 0 && j < board[i].length && board[i][j] > 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
