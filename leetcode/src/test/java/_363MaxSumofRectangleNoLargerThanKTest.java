import org.junit.Test;

import static org.junit.Assert.*;

public class _363MaxSumofRectangleNoLargerThanKTest {

    @Test
    public void maxSumSubmatrix() {
        assertEquals(2, new _363MaxSumofRectangleNoLargerThanK().maxSumSubmatrix(new int[][] {{0, 1}, {-2, 3}}, 2));
    }
}