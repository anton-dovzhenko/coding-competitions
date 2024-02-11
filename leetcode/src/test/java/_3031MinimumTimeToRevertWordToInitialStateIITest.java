import org.junit.Test;

import static org.junit.Assert.*;

public class _3031MinimumTimeToRevertWordToInitialStateIITest {

    @Test
    public void minimumTimeToInitialState() {
        assertEquals(2, new _3031MinimumTimeToRevertWordToInitialStateII().minimumTimeToInitialState("abacaba", 3));
        assertEquals(1, new _3031MinimumTimeToRevertWordToInitialStateII().minimumTimeToInitialState("abacaba", 4));
        assertEquals(4, new _3031MinimumTimeToRevertWordToInitialStateII().minimumTimeToInitialState("abcbabcd", 2));
        assertEquals(1, new _3031MinimumTimeToRevertWordToInitialStateII().minimumTimeToInitialState("aa", 1));
        assertEquals(2, new _3031MinimumTimeToRevertWordToInitialStateII().minimumTimeToInitialState("aab", 2));
        assertEquals(1, new _3031MinimumTimeToRevertWordToInitialStateII().minimumTimeToInitialState("ababa", 2));
    }
}