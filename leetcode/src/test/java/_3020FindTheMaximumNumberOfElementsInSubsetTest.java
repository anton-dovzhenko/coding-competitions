import org.junit.Test;

import static org.junit.Assert.*;

public class _3020FindTheMaximumNumberOfElementsInSubsetTest {

    @Test
    public void maximumLength() {
        assertEquals(3, new _3020FindTheMaximumNumberOfElementsInSubset().maximumLength(new int[]{5, 4, 1, 2, 2}));
        assertEquals(1, new _3020FindTheMaximumNumberOfElementsInSubset().maximumLength(new int[]{1, 3, 2, 4}));
        assertEquals(1, new _3020FindTheMaximumNumberOfElementsInSubset().maximumLength(new int[]{1, 1}));
        assertEquals(9, new _3020FindTheMaximumNumberOfElementsInSubset().maximumLength(
                new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024}));
    }
}