import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 26/3/17.
 */
public class NumComparator1Test {
    @Test
    public void compare() throws Exception {
        assertEquals(-1, new _179LargestNumber1.NumComparator1().compare(34, 3));
        assertEquals(-1, new _179LargestNumber1.NumComparator1().compare(34, 30));
        assertEquals(1, new _179LargestNumber1.NumComparator1().compare(30, 3));
    }

}