import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 29/4/18.
 */
public class _826MostProfitAssigningWorkTest {

    @Test
    public void testMaxProfitAssignment() throws Exception {
        assertEquals(100, new _826MostProfitAssigningWork().maxProfitAssignment(
                new int[] {2,4,6,8,10}
                , new int[] {10,20,30,40,50}
                , new int[] {4,5,6,7}
        ));
    }
}