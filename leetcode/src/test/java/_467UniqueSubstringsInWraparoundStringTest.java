import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 27/1/18.
 */
public class _467UniqueSubstringsInWraparoundStringTest {

    @Test
    public void testFindSubstringInWraproundString() throws Exception {
        assertEquals(0, new _467UniqueSubstringsInWraparoundString().findSubstringInWraproundString(""));
        assertEquals(1, new _467UniqueSubstringsInWraparoundString().findSubstringInWraproundString("a"));
        assertEquals(2, new _467UniqueSubstringsInWraparoundString().findSubstringInWraproundString("cac"));
        assertEquals(6, new _467UniqueSubstringsInWraparoundString().findSubstringInWraproundString("zab"));
        assertEquals(6, new _467UniqueSubstringsInWraparoundString().findSubstringInWraproundString("abc"));
        assertEquals(6, new _467UniqueSubstringsInWraparoundString().findSubstringInWraproundString("zaba"));
    }
}