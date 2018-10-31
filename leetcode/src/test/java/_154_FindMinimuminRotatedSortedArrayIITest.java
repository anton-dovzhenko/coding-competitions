import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 17/10/18.
 */
public class _154_FindMinimuminRotatedSortedArrayIITest {
    @Test
    public void findMin() throws Exception {
        assertEquals(0, new _154_FindMinimuminRotatedSortedArrayII().findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        assertEquals(0, new _154_FindMinimuminRotatedSortedArrayII().findMin(new int[]{4, 0, 1, 2}));
        assertEquals(0, new _154_FindMinimuminRotatedSortedArrayII().findMin(new int[]{0, 1, 2, 2, 2, 2, 2}));
        assertEquals(0, new _154_FindMinimuminRotatedSortedArrayII().findMin(new int[]{1, 2, 2, 2, 2, 2, 0}));
        assertEquals(0, new _154_FindMinimuminRotatedSortedArrayII().findMin(new int[]{2, 2, 2, 2, 2, 0, 1}));
        assertEquals(0, new _154_FindMinimuminRotatedSortedArrayII().findMin(new int[]{2, 2, 2, 2, 0, 1, 2}));
        assertEquals(0, new _154_FindMinimuminRotatedSortedArrayII().findMin(new int[]{2, 2, 2, 0, 1, 2, 2}));
        assertEquals(0, new _154_FindMinimuminRotatedSortedArrayII().findMin(new int[]{2, 2, 0, 1, 2, 2, 2}));
        assertEquals(0, new _154_FindMinimuminRotatedSortedArrayII().findMin(new int[]{2, 0, 1, 2, 2, 2, 2}));

    }

}