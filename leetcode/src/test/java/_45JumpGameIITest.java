import org.junit.Test;

import static org.junit.Assert.*;

public class _45JumpGameIITest {

    @Test
    public void jump() {
        assertEquals(2, new _45JumpGameII().jump(new int[] {2, 3, 1, 1, 4}));
        assertEquals(0, new _45JumpGameII().jump(new int[] {0}));
        assertEquals(1, new _45JumpGameII().jump(new int[] {2, 1}));
    }
}