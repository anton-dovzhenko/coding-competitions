import org.junit.Test;

import static org.junit.Assert.*;

public class _3567MinimumAbsoluteDifferenceInSlidingSubmatrixTest {

    @Test
    public void minAbsDiff() {
        assertArrayEquals(new int[][] {{2}}, new _3567MinimumAbsoluteDifferenceInSlidingSubmatrix().minAbsDiff(new int[][] {{1, 8}, {3, -2}}, 2));
        assertArrayEquals(new int[][] {{0, 0}}, new _3567MinimumAbsoluteDifferenceInSlidingSubmatrix().minAbsDiff(new int[][] {{3, -1}}, 1));
        assertArrayEquals(new int[][] {{1, 2}}, new _3567MinimumAbsoluteDifferenceInSlidingSubmatrix().minAbsDiff(new int[][] {{1, -2, 3}, {2, 3, 5}}, 2));
    }
}