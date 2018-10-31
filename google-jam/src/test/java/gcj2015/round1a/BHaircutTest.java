package gcj2015.round1a;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 17/12/16.
 */
public class BHaircutTest {

    @Test
    public void testGetBarberNumber() throws Exception {
        assertEquals(1, BHaircut.getBarberNumber(4, new long[] {10, 5}));
        assertEquals(3, BHaircut.getBarberNumber(12, new long[] {7, 7, 7}));
        assertEquals(1, BHaircut.getBarberNumber(8, new long[] {4, 2, 1}));
        assertEquals(2, BHaircut.getBarberNumber(12, new long[] {4, 2, 1}));
    }

    @Test
    public void testGetBarberNumber1() throws Exception {
        //assertEquals(1, BHaircut.getBarberNumber1(4, new long[] {10, 5}));
        //assertEquals(3, BHaircut.getBarberNumber1(12, new long[] {7, 7, 7}));
        //assertEquals(1, BHaircut.getBarberNumber1(8, new long[] {4, 2, 1}));
        assertEquals(2, BHaircut.getBarberNumber1(12, new long[]{4, 2, 1}));
    }
}