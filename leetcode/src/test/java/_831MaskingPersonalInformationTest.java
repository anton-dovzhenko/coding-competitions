import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 6/5/18.
 */
public class _831MaskingPersonalInformationTest {

    @Test
    public void testMaskPII() throws Exception {
        assertEquals("l*****e@leetcode.com"
                , new _831MaskingPersonalInformation().maskPII("LeetCode@LeetCode.com"));
        assertEquals("a*****b@qq.com"
                , new _831MaskingPersonalInformation().maskPII("AB@qq.com"));
        assertEquals("***-***-7890"
                , new _831MaskingPersonalInformation().maskPII("1(234)567-890"));
        assertEquals("+**-***-***-5678"
                , new _831MaskingPersonalInformation().maskPII("86-(10)12345678"));
    }
}