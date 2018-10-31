import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 9/2/17.
 */
public class _33SearchRotatedSortedArrayTest {
    @Test
    public void search() throws Exception {
        assertEquals(0, new _33SearchRotatedSortedArray().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 4));
        assertEquals(1, new _33SearchRotatedSortedArray().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 5));
        assertEquals(2, new _33SearchRotatedSortedArray().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 6));
        assertEquals(3, new _33SearchRotatedSortedArray().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 7));
        assertEquals(4, new _33SearchRotatedSortedArray().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(5, new _33SearchRotatedSortedArray().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 1));
        assertEquals(6, new _33SearchRotatedSortedArray().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 2));
        assertEquals(-1, new _33SearchRotatedSortedArray().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 10));
        assertEquals(-1, new _33SearchRotatedSortedArray().search(new int[] {1}, 0));
        assertEquals(-1, new _33SearchRotatedSortedArray().search(new int[] {1, 2}, 0));
        assertEquals(-1, new _33SearchRotatedSortedArray().search(new int[] {1, 2, 3}, 0));
        assertEquals(-1, new _33SearchRotatedSortedArray().search(new int[] {1}, 4));
        assertEquals(-1, new _33SearchRotatedSortedArray().search(new int[] {1, 2}, 4));
        assertEquals(-1, new _33SearchRotatedSortedArray().search(new int[] {1, 2, 3}, 4));
        assertEquals(0, new _33SearchRotatedSortedArray().search(new int[] {4, 5}, 4));
        assertEquals(0, new _33SearchRotatedSortedArray().search(new int[] {4}, 4));
    }

}