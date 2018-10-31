import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 28/3/17.
 */
public class _299BullsAndCowsTest {
    @Test
    public void getHint() throws Exception {
        assertEquals("1A3B", new _299BullsAndCows().getHint("1807", "7810"));
        assertEquals("1A1B", new _299BullsAndCows().getHint("1123", "0111"));
    }

}