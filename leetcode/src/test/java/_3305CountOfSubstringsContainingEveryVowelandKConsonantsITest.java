import org.junit.Test;

import static org.junit.Assert.*;

public class _3305CountOfSubstringsContainingEveryVowelandKConsonantsITest {

    @Test
    public void countOfSubstrings() {
        assertEquals(0, (new _3305CountOfSubstringsContainingEveryVowelandKConsonantsI().countOfSubstrings("aeioqq", 1)));
        assertEquals(1, (new _3305CountOfSubstringsContainingEveryVowelandKConsonantsI().countOfSubstrings("aeiou", 0)));
        assertEquals(3, (new _3305CountOfSubstringsContainingEveryVowelandKConsonantsI().countOfSubstrings("ieaouqqieaouqq", 1)));
        assertEquals(3, (new _3305CountOfSubstringsContainingEveryVowelandKConsonantsI().countOfSubstrings("iqeaouqi", 2)));
    }

}