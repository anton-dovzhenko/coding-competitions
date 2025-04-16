import org.junit.Test;

import static org.junit.Assert.*;

public class _3519CountNumbersWithNonDecreasingDigitsTest {

    @Test
    public void countNumbersTest() {
        assertEquals(3, new _3519CountNumbersWithNonDecreasingDigits().countNumbers("23", "28", 8));
        assertEquals(2, new _3519CountNumbersWithNonDecreasingDigits().countNumbers("2", "7", 2));
    }

}