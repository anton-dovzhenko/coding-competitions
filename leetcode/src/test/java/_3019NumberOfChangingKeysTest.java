import org.junit.Test;

import static org.junit.Assert.*;

public class _3019NumberOfChangingKeysTest {

    @Test
    public void countKeyChanges() {
        assertEquals(new _3019NumberOfChangingKeys().countKeyChanges("aAbBcC"), 2);
        assertEquals(new _3019NumberOfChangingKeys().countKeyChanges("bBBb"), 0);
    }
}