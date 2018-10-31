package gcj2017.qualification;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 8/4/17.
 */
public class CBathroomStalls1Test {

    @Test
    public void testGetLast1() throws Exception {
        assertArrayEquals(new int[]{1, 0}, CBathroomStalls1.getLast(4, 2));
        assertArrayEquals(new int[] {1, 0}, CBathroomStalls1.getLast(5, 2));
        assertArrayEquals(new int[] {1, 1}, CBathroomStalls1.getLast(6, 2));
        assertArrayEquals(new int[] {500, 499}, CBathroomStalls1.getLast(1000, 1));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls1.getLast(2, 2));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls1.getLast(3, 3));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls1.getLast(1000, 1000));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls1.getLast(1000, 999));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls1.getLast(4, 3));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls1.getLast(5, 4));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls1.getLast(5, 4));
    }

}