import org.junit.Test;

import static org.junit.Assert.*;

public class _3517SmallestPalindromicRearrangementITest {

    @Test
    public void smallestPalindrome() {
        assertEquals("z", new _3517SmallestPalindromicRearrangementI().smallestPalindrome("z"));
        assertEquals("abbba", new _3517SmallestPalindromicRearrangementI().smallestPalindrome("babab"));
    }
}