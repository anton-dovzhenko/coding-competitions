import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 27/3/17.
 */
public class _274HIndexTest {

    @Test
    public void hIndex() throws Exception {
        assertEquals(3, new _274HIndex().hIndex(new int[] {3, 0, 6, 1, 5}));
        assertEquals(3, new _274HIndex().hIndex(new int[] {4, 0, 6, 1, 5}));
        assertEquals(1, new _274HIndex().hIndex(new int[] {100}));
    }

    @Test
    public void hIndex2() throws Exception {
        assertEquals(3, new _274HIndex().hIndex2(new int[] {3, 0, 6, 1, 5}));
        //assertEquals(3, new _274HIndex().hIndex2(new int[] {4, 0, 6, 1, 5}));
        //assertEquals(1, new _274HIndex().hIndex2(new int[] {100}));
    }

}