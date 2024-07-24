import org.junit.Test;

import static org.junit.Assert.*;

public class _3228MaximumNumberOfOperationsToMoveOnesToTheEndTest {

    @Test
    public void maxOperations() {
        assertEquals(4, new _3228MaximumNumberOfOperationsToMoveOnesToTheEnd().maxOperations("1001101"));
        assertEquals(0, new _3228MaximumNumberOfOperationsToMoveOnesToTheEnd().maxOperations("00111"));
    }

}