import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 4/2/17.
 */
public class _415AddStringsTest {

    @Test
    public void addStrings() throws Exception {
        assertEquals("456", new _415AddStrings().addStrings("123", "333"));
        assertEquals("156", new _415AddStrings().addStrings("123", "33"));
        assertEquals("222", new _415AddStrings().addStrings("123", "99"));
        assertEquals("10", new _415AddStrings().addStrings("1", "9"));
        assertEquals("108", new _415AddStrings().addStrings("9", "99"));
    }

}