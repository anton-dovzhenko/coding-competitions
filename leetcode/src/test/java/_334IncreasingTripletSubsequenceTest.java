import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 14/5/18.
 */
public class _334IncreasingTripletSubsequenceTest {

    @Test
    public void increasingTriplet() throws Exception {
        assertTrue(new _334IncreasingTripletSubsequence().increasingTriplet(new int[] {1, 2, 3, 4, 5}));
        assertFalse(new _334IncreasingTripletSubsequence().increasingTriplet(new int[] {5, 4, 3, 2, 1}));
    }

}