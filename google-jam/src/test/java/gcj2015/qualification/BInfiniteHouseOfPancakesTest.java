package gcj2015.qualification;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 12/12/16.
 */
public class BInfiniteHouseOfPancakesTest {

    @Test
    public void testGetMinutes() throws Exception {
        assertEquals(3, BInfiniteHouseOfPancakes.getMinutes(new int[] {3}));
        assertEquals(2, BInfiniteHouseOfPancakes.getMinutes(new int[] {1, 2, 1, 2}));
        assertEquals(3, BInfiniteHouseOfPancakes.getMinutes(new int[] {4}));
        assertEquals(7, BInfiniteHouseOfPancakes.getMinutes(new int[] {4, 8, 7, 8, 3}));
        assertEquals(7, BInfiniteHouseOfPancakes.getMinutes(new int[] {1, 1, 5, 5, 9, 9}));
    }
}