import org.junit.Test;

import static org.junit.Assert.*;

public class _3297CountSubstringsThatCanBeRearrangedToContainStringITest {

    @Test
    public void validSubstringCount() {
        assertEquals(1, new _3297CountSubstringsThatCanBeRearrangedToContainStringI().validSubstringCount("bcca", "abc"));
        assertEquals(10, new _3297CountSubstringsThatCanBeRearrangedToContainStringI().validSubstringCount("abcabc", "abc"));
        assertEquals(0, new _3297CountSubstringsThatCanBeRearrangedToContainStringI().validSubstringCount("abcabc", "aaabc"));
        assertEquals(279, new _3297CountSubstringsThatCanBeRearrangedToContainStringI().validSubstringCount("ddccdddccdddccccdddccdcdcd", "ddc"));
    }
}