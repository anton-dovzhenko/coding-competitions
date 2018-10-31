package gcj2017.qualification;

/**
 * Created by anton on 22/4/17.
 */
public class DFashionShow {

    protected static void fillBoard(char[][] board) {

    }

    protected static void fillRooks(char[][] board) {

    }

    protected static void fillBishops(char[][] board) {
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == '.') {
                board[0][i] = '+';
            } else if (board[0][i] == 'x') {
                board[0][i] = 'o';
            }
        }

    }

}
