import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 28/1/18.
 */
public class _452MinimumNumberofArrowsToBurstBalloonsTest {

    @Test
    public void testFindMinArrowShots() throws Exception {
        assertEquals(2, new _452MinimumNumberofArrowsToBurstBalloons().findMinArrowShots2(
                new int[][] {{10, 16}
                        , {2, 8}, {1, 6}, {7, 12}}));
        assertEquals(3, new _452MinimumNumberofArrowsToBurstBalloons().findMinArrowShots2(
                new int[][]{{10, 16}
                        , {2, 11}, {1, 6}, {7, 9}}));
        assertEquals(1, new _452MinimumNumberofArrowsToBurstBalloons().findMinArrowShots2(
                new int[][]{{1,2147483647}}));
    }
}