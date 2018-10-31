import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 15/7/18.
 */
public class _868BinaryGapTest {
    @Test
    public void binaryGap() throws Exception {
        assertEquals(2, new _868BinaryGap().binaryGap(22));
        assertEquals(2, new _868BinaryGap().binaryGap(5));
        assertEquals(1, new _868BinaryGap().binaryGap(6));
        assertEquals(0, new _868BinaryGap().binaryGap(8));
    }

}