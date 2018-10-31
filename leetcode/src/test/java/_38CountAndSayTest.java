import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 13/1/17.
 */
public class _38CountAndSayTest {
    @Test
    public void countAndSay() throws Exception {
        assertEquals("1", new _38CountAndSay().countAndSay(1));
        assertEquals("11", new _38CountAndSay().countAndSay(2));
        assertEquals("21", new _38CountAndSay().countAndSay(3));
        assertEquals("1211", new _38CountAndSay().countAndSay(4));
        assertEquals("111221", new _38CountAndSay().countAndSay(5));
    }

}