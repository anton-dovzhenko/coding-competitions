import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 2/2/17.
 */
public class _242ValidAnagramTest {
    @Test
    public void isAnagram() throws Exception {
        assertTrue(new _242ValidAnagram().isAnagram("", ""));
        assertTrue(new _242ValidAnagram().isAnagram("anagram", "nagaram"));
        assertFalse(new _242ValidAnagram().isAnagram("rat", "car"));
    }

}