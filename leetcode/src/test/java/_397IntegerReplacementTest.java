import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 12/3/18.
 */
public class _397IntegerReplacementTest {

    @Test
    public void testIntegerReplacement() throws Exception {
        System.out.println((int) Math.pow(2, 16));
        System.out.println((long) Math.pow(2, 31));
        assertEquals(17, new _397IntegerReplacement().integerReplacement(65535));
        assertEquals(32, new _397IntegerReplacement().integerReplacement(2147483647));
    }
}