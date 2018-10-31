import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 2/5/18.
 */
public class _213HouseRobberIITest {

    @Test
    public void testRob() throws Exception {
        assertEquals(1, new _213HouseRobberII().rob(new int[] {1}));
        assertEquals(4, new _213HouseRobberII().rob(new int[] {1, 2, 3, 1}));
        assertEquals(20, new _213HouseRobberII().rob(new int[] {10, 1, 1, 10, 1}));
        assertEquals(3, new _213HouseRobberII().rob(new int[] {2, 3, 2}));
        assertEquals(8, new _213HouseRobberII().rob(new int[] {2, 1, 4, 7}));
        assertEquals(11, new _213HouseRobberII().rob(new int[] {2, 7, 9, 3, 1}));
    }
}