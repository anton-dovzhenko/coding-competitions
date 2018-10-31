package gcj2015.round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 24/12/16.
 */
public class APegmanTest {

    @Test
    public void testGetChangesCount() throws Exception {
        assertEquals(1, APegman.getChangesCount(2, 1, new int[][] {{0}, {0}}));
        assertEquals(0, APegman.getChangesCount(2, 2, new int[][] {{1, 2}, {0, 3}}));
        assertEquals(-1, APegman.getChangesCount(3, 3, new int[][] {{-1, -1, -1}, {-1, 0, -1}, {-1, -1, -1}}));
        assertEquals(0, APegman.getChangesCount(1, 1, new int[][] {{-1}}));
        assertEquals(0, APegman.getChangesCount(2, 2, new int[][] {{-1, -1}, {-1, -1}}));
    }

}