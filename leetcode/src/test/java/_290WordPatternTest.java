import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 30/3/17.
 */
public class _290WordPatternTest {
    @Test
    public void wordPattern() throws Exception {
        assertTrue(new _290WordPattern().wordPattern("abba", "dog cat cat dog"));
        assertFalse(new _290WordPattern().wordPattern("abba", "dog dog dog dog"));
        assertFalse(new _290WordPattern().wordPattern("abba", "dog cat cat fish"));
    }

}