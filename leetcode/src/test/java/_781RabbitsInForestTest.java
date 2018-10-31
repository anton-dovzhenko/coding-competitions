import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 17/2/18.
 */
public class _781RabbitsInForestTest {

    @Test
    public void testNumRabbits() throws Exception {
        assertEquals(5, new _781RabbitsInForest().numRabbits(new int[] {1, 1, 2}));
        assertEquals(5, new _781RabbitsInForest().numRabbits(new int[] {1, 0, 1, 0, 0}));
    }
}