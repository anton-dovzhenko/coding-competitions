import org.junit.Test;

import static org.junit.Assert.*;

public class _52NQueensIITest {

    @Test
    public void totalNQueens() {
        assertEquals(0, new _52NQueensII().totalNQueens(3));
        assertEquals(2, new _52NQueensII().totalNQueens(4));
        assertEquals(10, new _52NQueensII().totalNQueens(5));
        assertEquals(4, new _52NQueensII().totalNQueens(6));
        assertEquals(40, new _52NQueensII().totalNQueens(7));
        assertEquals(92, new _52NQueensII().totalNQueens(8));
    }
}