import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 26/2/18.
 */
public class _390EliminationGameTest {

    @Test
    public void testLastRemaining() throws Exception {
        assertEquals(6, new _390EliminationGame().lastRemaining2(8));
        assertEquals(6, new _390EliminationGame().lastRemaining2(9));
        assertEquals(4, new _390EliminationGame().lastRemaining2(6));
    }
}