import org.junit.Test;

import static org.junit.Assert.*;

public class _3035MaximumPalindromesAfterOperationsTest {

    @Test
    public void maxPalindromesAfterOperations() {
        assertEquals(3, new _3035MaximumPalindromesAfterOperations().maxPalindromesAfterOperations(new String[]{"abbb", "ba", "aa"}));
        assertEquals(2, new _3035MaximumPalindromesAfterOperations().maxPalindromesAfterOperations(new String[]{"abc", "ab"}));
        assertEquals(1, new _3035MaximumPalindromesAfterOperations().maxPalindromesAfterOperations(new String[]{"cd", "ef", "a"}));
        assertEquals(2, new _3035MaximumPalindromesAfterOperations().maxPalindromesAfterOperations(new String[]{"a", "b"}));
        assertEquals(1, new _3035MaximumPalindromesAfterOperations().maxPalindromesAfterOperations(new String[]{"aa", "bc"}));
    }
}