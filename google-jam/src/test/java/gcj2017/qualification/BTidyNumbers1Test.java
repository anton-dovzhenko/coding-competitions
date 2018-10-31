package gcj2017.qualification;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 8/4/17.
 */
public class BTidyNumbers1Test {

    @Test
    public void testGetLastTidyNumber1() throws Exception {
        assertEquals(129, BTidyNumbers1.getLastTidyNumber(132));
        assertEquals(129, BTidyNumbers1.getLastTidyNumber(129));
        assertEquals(999, BTidyNumbers1.getLastTidyNumber(1000));
        assertEquals(999, BTidyNumbers1.getLastTidyNumber(999));
        assertEquals(7, BTidyNumbers1.getLastTidyNumber(7));
        assertEquals(99999999999999999L, BTidyNumbers1.getLastTidyNumber(111111111111111110L));
        assertEquals(99999999999999999L, BTidyNumbers1.getLastTidyNumber(99999999999999999L));
    }
}