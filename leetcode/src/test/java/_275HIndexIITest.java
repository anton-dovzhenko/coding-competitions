import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 1/12/18.
 */
public class _275HIndexIITest {
    @Test
    public void hIndex() throws Exception {
        assertEquals(3, new _275HIndexII().hIndex(new int[] {0,1,3,5,6}));
        assertEquals(1, new _275HIndexII().hIndex(new int[] {100}));
        assertEquals(0, new _275HIndexII().hIndex(new int[] {0}));
        assertEquals(2, new _275HIndexII().hIndex(new int[] {11, 15}));
        assertEquals(3, new _275HIndexII().hIndex(new int[] {11, 15, 50}));
        assertEquals(2, new _275HIndexII().hIndex(new int[] {0, 0, 4, 4}));
    }

}