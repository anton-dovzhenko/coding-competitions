package gcj2017.qualification;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 8/4/17.
 */
public class CBathroomStallsTest {

    @Test
    public void testGetLast() throws Exception {
        assertArrayEquals(new int[] {1, 0}, CBathroomStalls.getLast(4, 2));
        assertArrayEquals(new int[] {1, 0}, CBathroomStalls.getLast(5, 2));
        assertArrayEquals(new int[] {1, 1}, CBathroomStalls.getLast(6, 2));
        assertArrayEquals(new int[] {500, 499}, CBathroomStalls.getLast(1000, 1));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls.getLast(2, 2));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls.getLast(3, 3));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls.getLast(1000, 1000));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls.getLast(1000, 999));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls.getLast(4, 3));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls.getLast(5, 4));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls.getLast(5, 4));
        assertArrayEquals(new int[] {0, 0}, CBathroomStalls.getLast(1000000, 999999));
    }
}