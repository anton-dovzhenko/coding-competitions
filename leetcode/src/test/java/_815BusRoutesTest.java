import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 27/4/18.
 */
public class _815BusRoutesTest {

    @Test
    public void testNumBusesToDestination() throws Exception {
        assertEquals(2, new _815BusRoutes().numBusesToDestination(new int[][] {{1, 2, 7}, {3, 6, 7}}, 1, 6));
    }
}