import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 21/1/18.
 */
public class _130SurroundedRegionsTest {

    @Test
    public void testSolve() throws Exception {
        char[][] board = new char[][] {{'O', 'O', 'O', 'O'}
            , {'O', 'O', 'O', 'X'}
            , {'O', 'X', 'O', 'X'}
            , {'O', 'O', 'X', 'X'}};
        new _130SurroundedRegions().solve(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}