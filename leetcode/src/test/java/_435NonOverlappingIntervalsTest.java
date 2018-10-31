import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 10/4/18.
 */
public class _435NonOverlappingIntervalsTest {

    @Test
    public void testEraseOverlapIntervals() throws Exception {
        assertEquals(1, new _435NonOverlappingIntervals().eraseOverlapIntervals(new Interval[]{new Interval(1, 2), new Interval(2, 3), new Interval(3, 4), new Interval(1, 3)}));
        assertEquals(2, new _435NonOverlappingIntervals().eraseOverlapIntervals(new Interval[]{new Interval(1, 2), new Interval(1, 2), new Interval(1, 2)}));
        assertEquals(0, new _435NonOverlappingIntervals().eraseOverlapIntervals(new Interval[]{new Interval(1, 2), new Interval(2, 3)}));
        assertEquals(2, new _435NonOverlappingIntervals().eraseOverlapIntervals(new Interval[]{new Interval(1, 100), new Interval(11, 22), new Interval(1, 11), new Interval(2, 12)}));
        assertEquals(4, new _435NonOverlappingIntervals().eraseOverlapIntervals(
                new Interval[]{new Interval(0, 2), new Interval(1, 3), new Interval(1, 3), new Interval(2, 4)
                        , new Interval(3, 5), new Interval(3, 5), new Interval(4, 6)}));
    }
}