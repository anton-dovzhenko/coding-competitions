import org.junit.Test;

import static org.junit.Assert.*;

public class _3043FindTheLengthOfTheLongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {

        assertEquals(3, new _3043FindTheLengthOfTheLongestCommonPrefix().longestCommonPrefix(new int[]{1, 10, 100}, new int[]{1000}));
        assertEquals(0, new _3043FindTheLengthOfTheLongestCommonPrefix().longestCommonPrefix(new int[]{1, 2, 3}, new int[]{4, 4, 4}));
        assertEquals(1, new _3043FindTheLengthOfTheLongestCommonPrefix().longestCommonPrefix(new int[]{1, 26}, new int[]{22, 2}));
        
    }
}