import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 21/2/18.
 */
public class _345ReverseVowelsofaStringTest {

    @Test
    public void testReverseVowels() throws Exception {
        assertEquals("holle", new _345ReverseVowelsofaString().reverseVowels("hello"));
        assertEquals("leotcede", new _345ReverseVowelsofaString().reverseVowels("leetcode"));
    }

}