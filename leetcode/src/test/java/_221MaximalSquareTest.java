import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 23/2/17.
 */
public class _221MaximalSquareTest {
    @Test
    public void maximalSquare() throws Exception {
        assertEquals(4, new _221MaximalSquare().maximalSquare4(
                new char[][] {
                        {'1','0','1','0','0'}
                        , {'1','0','1','1','1'}
                        , {'1','1','1','1','1'}
                        , {'1','0','0','1','0'}
                }
        ));
    }

}