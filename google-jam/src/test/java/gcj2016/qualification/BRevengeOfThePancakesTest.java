package gcj2016.qualification;

import gcj2016.qualification.BRevengeOfThePancakes;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 9/1/17.
 */
public class BRevengeOfThePancakesTest {

    @Test
    public void getNumberOfFlips() throws Exception {
        assertEquals(1, BRevengeOfThePancakes.getNumberOfFlips("-"));
        assertEquals(1, BRevengeOfThePancakes.getNumberOfFlips("-+"));
        assertEquals(2, BRevengeOfThePancakes.getNumberOfFlips("+-"));
        assertEquals(0, BRevengeOfThePancakes.getNumberOfFlips("+++"));
        assertEquals(3, BRevengeOfThePancakes.getNumberOfFlips("--+-"));
    }

}