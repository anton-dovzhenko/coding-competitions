import org.junit.Test;

import static org.junit.Assert.*;

public class _51NQueensTest {

    @Test
    public void solveNQueens() {
        assertEquals(0, new _51NQueens().solveNQueens(3).size());
        assertEquals(2, new _51NQueens().solveNQueens(4).size());
        assertEquals(10, new _51NQueens().solveNQueens(5).size());
        assertEquals(4, new _51NQueens().solveNQueens(6).size());
        assertEquals(40, new _51NQueens().solveNQueens(7).size());
        assertEquals(92, new _51NQueens().solveNQueens(8).size());
    }

}