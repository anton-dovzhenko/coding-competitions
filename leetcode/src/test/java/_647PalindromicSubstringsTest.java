import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 4/2/18.
 */
public class _647PalindromicSubstringsTest {

    @Test
    public void testCountSubstrings() throws Exception {
        assertEquals(3, new _647PalindromicSubstrings().countSubstrings("abc"));
        assertEquals(6, new _647PalindromicSubstrings().countSubstrings("aaa"));
    }
}