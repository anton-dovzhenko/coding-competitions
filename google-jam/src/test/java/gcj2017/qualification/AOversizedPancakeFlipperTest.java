package gcj2017.qualification;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 8/4/17.
 */
public class AOversizedPancakeFlipperTest {

    @Test
    public void testGetMinFlips() throws Exception {
        assertEquals(3, AOversizedPancakeFlipper.getMinFlips("---+-++-", 3));
        assertEquals(0, AOversizedPancakeFlipper.getMinFlips("+++++", 4));
        assertEquals(-1, AOversizedPancakeFlipper.getMinFlips("-+-+-", 4));
    }
}