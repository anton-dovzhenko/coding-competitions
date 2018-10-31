import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 25/2/18.
 */
public class _55JumpGameTest {

    @Test
    public void testCanJump() throws Exception {
        assertTrue(new _55JumpGame().canJump(new int[] {2, 3, 1, 1, 4}));
        assertFalse(new _55JumpGame().canJump(new int[]{3, 2, 1, 0, 4}));
    }
}