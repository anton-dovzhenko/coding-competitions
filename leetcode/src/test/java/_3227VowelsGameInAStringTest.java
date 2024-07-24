import org.junit.Test;

import static org.junit.Assert.*;

public class _3227VowelsGameInAStringTest {

    @Test
    public void doesAliceWin() {
        assertTrue(new _3227VowelsGameInAString().doesAliceWin("leetcoder"));
        assertFalse(new _3227VowelsGameInAString().doesAliceWin("bbcd"));
    }

}