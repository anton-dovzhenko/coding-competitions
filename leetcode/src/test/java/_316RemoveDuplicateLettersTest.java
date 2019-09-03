import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 3/4/17.
 */
public class _316RemoveDuplicateLettersTest {
    @Test
    public void removeDuplicateLetters() throws Exception {
        assertEquals("abc", new _316RemoveDuplicateLetters().removeDuplicateLetters("bcabc"));
        assertEquals("acdb", new _316RemoveDuplicateLetters().removeDuplicateLetters("cbacdcbc"));
        assertEquals("bac", new _316RemoveDuplicateLetters().removeDuplicateLetters("cbac"));
    }

}