import org.junit.Test;

import static org.junit.Assert.*;

public class _3029MinimumTimeToRevertWordToInitialStateITest {

    @Test
    public void minimumTimeToInitialState() {
        assertEquals(2, new _3029MinimumTimeToRevertWordToInitialStateI().minimumTimeToInitialState("abacaba", 3));
        assertEquals(1, new _3029MinimumTimeToRevertWordToInitialStateI().minimumTimeToInitialState("abacaba", 4));
        assertEquals(4, new _3029MinimumTimeToRevertWordToInitialStateI().minimumTimeToInitialState("abcbabcd", 2));
        assertEquals(1, new _3029MinimumTimeToRevertWordToInitialStateI().minimumTimeToInitialState("aa", 1));
        assertEquals(2, new _3029MinimumTimeToRevertWordToInitialStateI().minimumTimeToInitialState("aab", 2));
        assertEquals(1, new _3029MinimumTimeToRevertWordToInitialStateI().minimumTimeToInitialState("ababa", 2));
    }

}