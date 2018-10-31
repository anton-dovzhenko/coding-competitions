import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by anton on 4/6/17.
 */
public class _56MergeIntervalsTest {
    @Test
    public void merge1() throws Exception {
        List<Interval> input = Arrays.asList(new Interval(1, 3)
                , new Interval(2, 6)
                , new Interval(8, 10)
                , new Interval(15, 18));
        List<Interval> result = new _56MergeIntervals().merge(input);
        System.out.println(result);
    }

    @Test
    public void merge2() throws Exception {
        List<Interval> input = Arrays.asList(new Interval(1, 3)
                , new Interval(2, 6)
                , new Interval(8, 10)
                , new Interval(15, 18)
                , new Interval(-5, 17));
        List<Interval> result = new _56MergeIntervals().merge(input);
        System.out.println(result);
    }

}