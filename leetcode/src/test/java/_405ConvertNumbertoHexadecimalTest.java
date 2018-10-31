import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 17/2/18.
 */
public class _405ConvertNumbertoHexadecimalTest {

    @Test
    public void testToHex() throws Exception {
        assertEquals("1a", new _405ConvertNumbertoHexadecimal().toHex(26));
        assertEquals("ffffffff", new _405ConvertNumbertoHexadecimal().toHex(-1));
    }
}