import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 2/7/17.
 */
public class _605CanPlaceFlowersTest {

    @Test
    public void testCanPlaceFlowers() throws Exception {
        assertTrue(new _605CanPlaceFlowers().canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1));
        assertFalse(new _605CanPlaceFlowers().canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 2));
        assertFalse(new _605CanPlaceFlowers().canPlaceFlowers(new int[] {1,0,1,0,1,0,1}, 1));
    }
}