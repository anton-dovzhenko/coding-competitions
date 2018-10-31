import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 26/9/17.
 */
public class _238ProductofArrayExceptSelfTest {

    @Test
    public void testProductExceptSelf() throws Exception {

    }

    @Test
    public void testProductExceptSelf2() throws Exception {
        assertArrayEquals(new int[] {0, 1}, new _238ProductofArrayExceptSelf().productExceptSelf2(new int[] {1, 0}));
    }
}