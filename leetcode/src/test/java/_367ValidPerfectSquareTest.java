import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 21/2/17.
 */
public class _367ValidPerfectSquareTest {
    @Test
    public void isPerfectSquare() throws Exception {
        assertTrue(new _367ValidPerfectSquare().isPerfectSquare(16));
        assertFalse(new _367ValidPerfectSquare().isPerfectSquare(2147483647));
    }

}