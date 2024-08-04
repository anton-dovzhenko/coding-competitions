import org.junit.Test;

import static org.junit.Assert.*;

public class _3233FindTheCountOfNumbersWhichAreNotSpecialTest {

    @Test
    public void nonSpecialCount() {
        assertEquals(new _3233FindTheCountOfNumbersWhichAreNotSpecial().nonSpecialCount(5, 7), 3);
        assertEquals(new _3233FindTheCountOfNumbersWhichAreNotSpecial().nonSpecialCount(4, 16), 11);
        assertEquals(new _3233FindTheCountOfNumbersWhichAreNotSpecial().nonSpecialCount(5, 16), 11);
        assertEquals(new _3233FindTheCountOfNumbersWhichAreNotSpecial().nonSpecialCount(1000000000, 1000000000), 1);
    }

}