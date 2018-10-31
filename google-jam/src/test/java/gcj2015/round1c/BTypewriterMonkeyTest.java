package gcj2015.round1c;

import org.junit.Test;

import static java.lang.Math.pow;
import static org.junit.Assert.*;

/**
 * Created by anton on 23/12/16.
 */
public class BTypewriterMonkeyTest {

    @Test
    public void testMaxBananas() throws Exception {
        assertEquals(0, BTypewriterMonkey.maxBananas("BANANAS", "MONKEY", 6));
        assertEquals(2, BTypewriterMonkey.maxBananas("AA", "AAA", 4));
        assertEquals(2, BTypewriterMonkey.maxBananas("AB", "B", 2));
        assertEquals(1, BTypewriterMonkey.maxBananas("GOOGLE", "GO", 2));
        assertEquals(9, BTypewriterMonkey.maxBananas("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ROSENCRANTZ", 100));
        assertEquals(1, BTypewriterMonkey.maxBananas("ASJD", "ASDJASD", 7));
    }

    @Test
    public void testGetAvgBananas() throws Exception {
        assertEquals(1, BTypewriterMonkey.getAvgBananas("AB", "B", 2), 1e-6);
        assertEquals(1.0 / 9, BTypewriterMonkey.getAvgBananas("GOOGLE", "GO", 2), 1e-6);
        assertEquals(0.0, BTypewriterMonkey.getAvgBananas("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ROSENCRANTZ", 100), 1e-6);
        assertEquals(1.0 / pow(4, 7), BTypewriterMonkey.getAvgBananas("ASJD", "ASDJASD", 7), 1e-6);
    }

    @Test
    public void testGetLeftBananas() throws Exception {
        assertEquals(0, BTypewriterMonkey.getLeftBananas("BANANAS", "MONKEY", 6), 1e-6);
        assertEquals(0, BTypewriterMonkey.getLeftBananas("AA", "AAA", 4), 1e-6);
        assertEquals(1, BTypewriterMonkey.getLeftBananas("AB", "B", 2), 1e-6);
        assertEquals(0.8888889, BTypewriterMonkey.getLeftBananas("GOOGLE", "GO", 2), 1e-6);
    }

}