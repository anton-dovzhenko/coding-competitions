/**
 * Created by anton on 28/12/17.
 */
public class _79WordSearch {

    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (exists(board, visited, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exists(char[][] board, boolean[][] visited, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j]) {
            return false;
        }
        char c = board[i][j];
        boolean e = false;
        if (c == word.charAt(index) && !visited[i][j]) {
            visited[i][j] = true;
            e = exists(board, visited, word, i, j - 1, index + 1)
                    || exists(board, visited, word, i, j + 1, index + 1)
                    || exists(board, visited, word, i - 1, j, index + 1)
                    || exists(board, visited, word, i + 1, j, index + 1);
        }
        visited[i][j] = false;
        return e;
    }

}
