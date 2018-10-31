import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 15/1/17.
 */
public class _27RemoveElementTest {
    @Test
    public void removeElement() throws Exception {
        int[] array = {3, 2, 2, 3};
        assertEquals(2, new _27RemoveElement().removeElement(array, 3));
        assertArrayEquals(new int[] {2, 2, 3, 3}, array);

        array = new int[]{2};
        assertEquals(1, new _27RemoveElement().removeElement(array, 3));
        assertArrayEquals(new int[] {2}, array);

        array = new int[]{1};
        assertEquals(0, new _27RemoveElement().removeElement(array, 1));
        assertArrayEquals(new int[] {1}, array);
    }

}