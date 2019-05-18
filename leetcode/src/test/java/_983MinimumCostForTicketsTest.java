import org.junit.Test;

import static org.junit.Assert.*;

public class _983MinimumCostForTicketsTest {

    @Test
    public void mincostTickets() {
        assertEquals(11, new _983MinimumCostForTickets().mincostTickets(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15}));
        assertEquals(17, new _983MinimumCostForTickets().mincostTickets(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31}, new int[]{2, 7, 15}));

    }
}