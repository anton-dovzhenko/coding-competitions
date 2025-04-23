import org.junit.Test;

import static org.junit.Assert.*;

public class _3523MakeArrayNonDecreasingTest {

    @Test
    public void maximumPossibleSize() {
        assertEquals(3, new _3523MakeArrayNonDecreasing().maximumPossibleSize(new int[] {4,2,5,3,5}));
        assertEquals(3, new _3523MakeArrayNonDecreasing().maximumPossibleSize(new int[] {1,2,3}));
    }

}