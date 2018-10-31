import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 5/2/18.
 */
public class _295FindMedianfromDataStream2Test {

    @Test
    public void testFindMedian() throws Exception {
        _295FindMedianfromDataStream2 med = new _295FindMedianfromDataStream2();
        med.addNum(1);
        assertEquals(1f, med.findMedian(), 1e-6);
        med.addNum(2);
        assertEquals(1.5, med.findMedian(), 1e-6);
        med.addNum(3);
        assertEquals(2f, med.findMedian(), 1e-6);
        med.addNum(4);
        assertEquals(2.5f, med.findMedian(), 1e-6);
        med.addNum(5);
        assertEquals(3f, med.findMedian(), 1e-6);
    }
}