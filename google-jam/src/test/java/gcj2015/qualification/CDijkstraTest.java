package gcj2015.qualification;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 13/12/16.
 */
public class CDijkstraTest {

    @Test
    public void testIsIjk() throws Exception {
        assertFalse(CDijkstra.isIjk("ik"));
        assertTrue(CDijkstra.isIjk("ijk"));
        assertFalse(CDijkstra.isIjk("kji"));
        assertTrue(CDijkstra.isIjk("jijijijijiji"));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10_000; i++) {
            sb.append("i");
        }
        assertFalse(CDijkstra.isIjk(sb.toString()));
        assertTrue(CDijkstra.isIjk("ijij"));
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(2, CDijkstra.multiply(new int[] {3, 2, 3}, 0, 2));
        assertEquals(3, CDijkstra.multiply(new int[] {2, 3, 2}, 0, 2));
        assertEquals(4, CDijkstra.multiply(new int[]{3, 2, 3, 2, 3, 2}, 0, 5));
    }
}