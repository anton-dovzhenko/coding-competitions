import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 4/6/17.
 */
public class _80RemoveDuplicatesFromSortedArrayIITest {
    @Test
    public void removeDuplicates() throws Exception {
        assertEquals(5, new _80RemoveDuplicatesFromSortedArrayII().removeDuplicates(new int[] {1, 1, 1, 2, 2, 3}));
        assertEquals(3, new _80RemoveDuplicatesFromSortedArrayII().removeDuplicates(new int[] {1, 1, 1, 2}));
        assertEquals(4, new _80RemoveDuplicatesFromSortedArrayII().removeDuplicates(new int[] {1, 1, 1, 1, 3, 3}));
    }

}