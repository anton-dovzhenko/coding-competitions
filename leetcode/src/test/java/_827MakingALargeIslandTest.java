import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 30/4/18.
 */
public class _827MakingALargeIslandTest {

    @Test
    public void testLargestIsland() throws Exception {
        assertEquals(1, new _827MakingALargeIsland().largestIsland(new int[][]{{0, 0}, {0, 0}}));
        assertEquals(3, new _827MakingALargeIsland().largestIsland(new int[][]{{1, 0}, {0, 1}}));
        assertEquals(4, new _827MakingALargeIsland().largestIsland(new int[][]{{1, 1}, {0, 1}}));
        assertEquals(4, new _827MakingALargeIsland().largestIsland(new int[][]{{1, 1}, {1, 1}}));
    }
}