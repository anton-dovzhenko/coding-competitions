import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 20/8/17.
 */
public class _16_3SumClosestTest {

    @Test
    public void testThreeSumClosest() throws Exception {
        assertEquals(0, new _16_3SumClosest().threeSumClosest(new int[] {0, 0, 0}, 1));
        assertEquals(3, new _16_3SumClosest().threeSumClosest(new int[] {0, 1, 2}, 0));
        assertEquals(3, new _16_3SumClosest().threeSumClosest(new int[] {1, 1, 1, 0}, 100));
        assertEquals(0, new _16_3SumClosest().threeSumClosest(new int[] {0, 2, 1, -3}, 1));
    }
}