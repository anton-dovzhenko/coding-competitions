import org.junit.Test;

import static org.junit.Assert.*;

public class _403FrogJumpTest {

    @Test
    public void canCross() {
        assertTrue(new _403FrogJump().canCross(new int[]{0, 1, 3, 5, 6, 8, 12, 17}));
        assertFalse(new _403FrogJump().canCross(new int[]{0, 1, 2, 3, 4, 8, 9, 11}));
    }
}