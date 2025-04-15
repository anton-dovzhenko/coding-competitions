import org.junit.Test;

import static org.junit.Assert.*;

public class _3516FindClosestPersonTest {

    @Test
    public void findClosest() {
        assertEquals(1, new _3516FindClosestPerson().findClosest(2, 7, 4));
        assertEquals(2, new _3516FindClosestPerson().findClosest(2, 5, 6));
        assertEquals(0, new _3516FindClosestPerson().findClosest(1, 5, 3));
    }

}