import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 26/3/17.
 */
public class NumComparatorTest {
    @Test
    public void compare() throws Exception {
        assertEquals(-1, new _179LargestNumber.NumComparator().compare("34", "3"));
    }

}