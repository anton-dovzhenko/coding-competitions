import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 24/11/18.
 */
public class _935KnightDialerTest {
    @Test
    public void knightDialer() throws Exception {
        assertEquals(10, new _935KnightDialer().knightDialer(1));
        assertEquals(20, new _935KnightDialer().knightDialer(2));
        assertEquals(46, new _935KnightDialer().knightDialer(3));
    }

}