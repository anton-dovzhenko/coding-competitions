import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 18/1/18.
 */
public class _135CandyTest {

    @Test
    public void testCandy() throws Exception {
        assertEquals(1, new _135Candy().candy(new int[]{0}));
        assertEquals(6, new _135Candy().candy(new int[]{1, 2, 3}));
        assertEquals(15, new _135Candy().candy(new int[]{1, 1, 2, 2, 3, 3, 3}));

        assertEquals(5, new _135Candy().candy(new int[]{3, 1, 2}));
        assertEquals(6, new _135Candy().candy(new int[]{3, 1, 1, 2}));
        assertEquals(9, new _135Candy().candy(new int[]{4, 5, 6, 1, 1, 1}));
    }
}