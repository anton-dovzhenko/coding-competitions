import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 15/4/18.
 */
public class _817LinkedListComponentsTest {

    @Test
    public void testNumComponents() throws Exception {
        assertEquals(2, new _817LinkedListComponents().numComponents(
                ListNode.fromArray(new int[]{0, 1, 2, 3}), new int[] {0, 1, 3}
        ));
    }
}