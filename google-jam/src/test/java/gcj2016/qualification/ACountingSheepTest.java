package gcj2016.qualification;

import gcj2016.qualification.ACountingSheep;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by anton on 9/1/17.
 */
public class ACountingSheepTest {

    @Test
    public void getLastNumber() throws Exception {
        assertNull(ACountingSheep.getLastNumber(BigInteger.valueOf(0)));
        assertEquals(BigInteger.valueOf(10), ACountingSheep.getLastNumber(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(90), ACountingSheep.getLastNumber(BigInteger.valueOf(2)));
        assertEquals(BigInteger.valueOf(110), ACountingSheep.getLastNumber(BigInteger.valueOf(11)));
        assertEquals(BigInteger.valueOf(5076), ACountingSheep.getLastNumber(BigInteger.valueOf(1692)));
    }

}