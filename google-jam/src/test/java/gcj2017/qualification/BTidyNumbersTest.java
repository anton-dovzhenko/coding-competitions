package gcj2017.qualification;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 8/4/17.
 */
public class BTidyNumbersTest {

    @Test
    public void testGetLastTidyNumber() throws Exception {
        assertEquals(129, BTidyNumbers.getLastTidyNumber(132));
        assertEquals(999, BTidyNumbers.getLastTidyNumber(1000));
        assertEquals(7, BTidyNumbers.getLastTidyNumber(7));
        assertEquals(129, BTidyNumbers.getLastTidyNumber(129));
        assertEquals(99999999999999999L, BTidyNumbers.getLastTidyNumber(111111111111111110L));
    }
}