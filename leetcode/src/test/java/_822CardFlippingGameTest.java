import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 22/4/18.
 */
public class _822CardFlippingGameTest {

    @Test
    public void testFlipgame() throws Exception {
        assertEquals(2, new _822CardFlippingGame().
                flipgame(new int[] {1,2,4,4,7}, new int[] {1,3,4,1,3}));
    }
}