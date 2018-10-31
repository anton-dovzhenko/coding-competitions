package gcj2015.round1b;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 19/12/16.
 */
public class ACounterCultureTest {

    @Test
    public void testGetCounter() throws Exception {
        assertEquals(1, ACounterCulture.getCounter2(1));
        assertEquals(19, ACounterCulture.getCounter2(19));
        assertEquals(15, ACounterCulture.getCounter2(23));
        assertEquals(28, ACounterCulture.getCounter2(99));
        assertEquals(29, ACounterCulture.getCounter2(100));
        assertEquals(38, ACounterCulture.getCounter2(109));
        assertEquals(39, ACounterCulture.getCounter2(190));
        assertEquals(48, ACounterCulture.getCounter2(199));
        //assertEquals(49, ACounterCulture.getCounter2(200));
        assertEquals(49, ACounterCulture.getCounter2(991));
        assertEquals(57, ACounterCulture.getCounter2(999));
        assertEquals(58, ACounterCulture.getCounter2(1000));
        assertEquals(67, ACounterCulture.getCounter2(1009));
        assertEquals(68, ACounterCulture.getCounter2(1090));
        assertEquals(68, ACounterCulture.getCounter2(1900));
        assertEquals(68, ACounterCulture.getCounter2(9100));
        //assertEquals(33, ACounterCulture.getCounter2(1101));
        //assertEquals(121, ACounterCulture.getCounter2(109876));
    }
}