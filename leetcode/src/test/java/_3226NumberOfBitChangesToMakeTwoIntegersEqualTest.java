import org.junit.Test;

import static org.junit.Assert.*;

public class _3226NumberOfBitChangesToMakeTwoIntegersEqualTest {

    @Test
    public void minChanges() {
        assertEquals(2, new _3226NumberOfBitChangesToMakeTwoIntegersEqual().minChanges(13, 4));
        assertEquals(0, new _3226NumberOfBitChangesToMakeTwoIntegersEqual().minChanges(21, 21));
        assertEquals(-1, new _3226NumberOfBitChangesToMakeTwoIntegersEqual().minChanges(14, 13));
    }
}