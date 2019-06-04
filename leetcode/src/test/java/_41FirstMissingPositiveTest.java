import org.junit.Test;

import static org.junit.Assert.*;

public class _41FirstMissingPositiveTest {

    @Test
    public void firstMissingPositive() {
        assertEquals(3, new _41FirstMissingPositive().firstMissingPositive(new int[]{1, 2, 0}));
        assertEquals(2, new _41FirstMissingPositive().firstMissingPositive(new int[]{3, 4, -1, 1}));
        assertEquals(1, new _41FirstMissingPositive().firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
        assertEquals(2, new _41FirstMissingPositive().firstMissingPositive(new int[]{1, 1}));
    }

}