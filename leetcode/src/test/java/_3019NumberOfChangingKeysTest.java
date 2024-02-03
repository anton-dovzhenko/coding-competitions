import org.junit.Test;

import static org.junit.Assert.*;

public class _3019NumberOfChangingKeysTest {

    @Test
    public void countKeyChanges() {
        assertEquals(2, new _3019NumberOfChangingKeys().countKeyChanges("aAbBcC"));
        assertEquals(0, new _3019NumberOfChangingKeys().countKeyChanges("bBBb"));
    }
}