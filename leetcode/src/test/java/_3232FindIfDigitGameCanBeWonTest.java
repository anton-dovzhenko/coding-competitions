import org.junit.Test;

import static org.junit.Assert.*;

public class _3232FindIfDigitGameCanBeWonTest {

    @Test
    public void canAliceWin() {
        assertFalse(new _3232FindIfDigitGameCanBeWon().canAliceWin(new int[]{1, 2, 3, 4, 10}));
        assertTrue(new _3232FindIfDigitGameCanBeWon().canAliceWin(new int[]{1, 2, 3, 4, 5, 14}));
        assertTrue(new _3232FindIfDigitGameCanBeWon().canAliceWin(new int[]{5, 5, 5, 25}));
    }

}