import org.junit.Test;

import static org.junit.Assert.*;

public class _64MinimumPathSumTest {

    @Test
    public void minPathSum() {
        assertEquals(7, new _64MinimumPathSum().minPathSum(
                new int[][] {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }

}