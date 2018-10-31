import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 12/2/17.
 */
public class _36ValidSudokuTest {
    @Test
    public void isValidSudoku() throws Exception {

        assertFalse(new _36ValidSudoku().isValidSudoku(new char[][] {
                "7...4....".toCharArray()
                ,"...865...".toCharArray()
                ,".1.2.....".toCharArray()
                ,".....9...".toCharArray()
                ,"....5.5..".toCharArray()
                ,".........".toCharArray()
                ,"......2..".toCharArray()
                ,".........".toCharArray()
                ,".........".toCharArray()}));

    }

}