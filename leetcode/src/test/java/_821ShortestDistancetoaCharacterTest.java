import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 22/4/18.
 */
public class _821ShortestDistancetoaCharacterTest {

    @Test
    public void testShortestToChar() throws Exception {
        assertArrayEquals(new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0},
                new _821ShortestDistancetoaCharacter().shortestToChar("loveleetcode", 'e'));
    }
}