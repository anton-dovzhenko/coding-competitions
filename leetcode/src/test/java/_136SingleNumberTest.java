import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 1/2/17.
 */
public class _136SingleNumberTest {
    @Test
    public void singleNumber() throws Exception {
        assertEquals(5, new _136SingleNumber().singleNumber(new int[] {1,2,3,4,5,1,2,3,4}));
    }

}