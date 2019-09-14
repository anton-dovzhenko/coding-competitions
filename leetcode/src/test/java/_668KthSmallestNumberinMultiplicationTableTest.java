import org.junit.Test;

import static org.junit.Assert.*;

public class _668KthSmallestNumberinMultiplicationTableTest {

    @Test
    public void findKthNumber() {
        assertEquals(3, new _668KthSmallestNumberinMultiplicationTable().findKthNumber(3, 3, 5));
        assertEquals(312, new _668KthSmallestNumberinMultiplicationTable().findKthNumber(45, 12, 471));
    }
}