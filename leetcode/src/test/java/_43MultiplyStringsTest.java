import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 9/2/17.
 */
public class _43MultiplyStringsTest {
    @Test
    public void multiply() throws Exception {
        assertEquals("0", new _43MultiplyStrings().multiply("0", "0"));
        assertEquals("891", new _43MultiplyStrings().multiply("9", "99"));
        assertEquals("9801", new _43MultiplyStrings().multiply("99", "99"));
    }

}