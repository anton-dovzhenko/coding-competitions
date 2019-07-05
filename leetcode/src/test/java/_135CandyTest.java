import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 18/1/18.
 */
public class _135CandyTest {

    @Test
    public void testCandy() throws Exception {
        assertEquals(5, new _135Candy().candy(new int[]{1, 0, 2}));
        assertEquals(4, new _135Candy().candy(new int[]{1, 2, 2}));
        assertEquals(7, new _135Candy().candy(new int[]{1, 3, 2, 2, 1}));
        assertEquals(13, new _135Candy().candy(new int[]{1, 2, 87, 87, 87, 2, 1}));
        assertEquals(9, new _135Candy().candy(new int[]{1, 2, 3, 1, 0}));
        assertEquals(4, new _135Candy().candy(new int[]{2, 1, 1}));
    }
}