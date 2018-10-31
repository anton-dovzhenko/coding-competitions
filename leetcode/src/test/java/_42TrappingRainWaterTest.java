import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 29/9/17.
 */
public class _42TrappingRainWaterTest {

    @Test
    public void testTrap() throws Exception {
        assertEquals(23, new _42TrappingRainWater().trap(new int[] {5,5,1,7,1,1,5,2,7,6}));
    }
}