package gcj2015.round1c;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 23/12/16.
 */
public class ABrattleshipTest {

    @Test
    public void testGetMoveCount() throws Exception {
        assertEquals(3, ABrattleship.getMoveCount(1, 4, 2));
        assertEquals(7, ABrattleship.getMoveCount(1, 7, 7));
        assertEquals(10, ABrattleship.getMoveCount(2, 5, 1));
    }
}