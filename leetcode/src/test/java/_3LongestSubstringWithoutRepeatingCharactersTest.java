import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 4/2/17.
 */
public class _3LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void lengthOfLongestSubstring() throws Exception {
        assertEquals(3, new _3LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, new _3LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, new _3LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
        assertEquals(1, new _3LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("c"));
        assertEquals(2, new _3LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abba"));
    }

}