import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 19/2/18.
 */
public class _413ArithmeticSlicesTest {

    @Test
    public void testNumberOfArithmeticSlices() throws Exception {
        assertEquals(3, new _413ArithmeticSlices().numberOfArithmeticSlices(new int[] {1, 2, 3, 4}));
    }
}