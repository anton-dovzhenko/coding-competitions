import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 15/7/18.
 */
public class _869ReorderedPowerof2Test {
    @Test
    public void reorderedPowerOf2() throws Exception {
        assertTrue(new _869ReorderedPowerof2().reorderedPowerOf2(1));
        assertFalse(new _869ReorderedPowerof2().reorderedPowerOf2(10));
        assertTrue(new _869ReorderedPowerof2().reorderedPowerOf2(16));
        assertFalse(new _869ReorderedPowerof2().reorderedPowerOf2(24));
        assertTrue(new _869ReorderedPowerof2().reorderedPowerOf2(46));

    }

}