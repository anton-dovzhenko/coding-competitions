import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 17/4/18.
 */
public class _91DecodeWaysTest {

    @Test
    public void testNumDecodings() throws Exception {
        assertEquals(3, new _91DecodeWays().numDecodings("12345"));
        assertEquals(2, new _91DecodeWays().numDecodings("12"));
        assertEquals(0, new _91DecodeWays().numDecodings("00"));
    }
}