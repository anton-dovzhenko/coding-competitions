import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 12/2/17.
 */
public class _26RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void removeDuplicates() throws Exception {
        int[] nums = new int[] {1};
        assertEquals(1, new _26RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
        assertArrayEquals(new int[] {1}, nums);

        nums = new int[] {1, 1, 1};
        assertEquals(1, new _26RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
        assertArrayEquals(new int[] {1, 1, 1}, nums);

        nums = new int[] {1, 1, 2};
        assertEquals(2, new _26RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
        assertArrayEquals(new int[] {1, 2, 2}, nums);

    }

}