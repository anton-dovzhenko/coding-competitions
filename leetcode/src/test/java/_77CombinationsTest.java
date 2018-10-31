import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by anton on 15/1/17.
 */
public class _77CombinationsTest {
    @Test
    public void combine() throws Exception {
        List<List<Integer>> combinations = new _77Combinations().combine(4, 2);
        assertEquals(6, combinations.size());
        System.out.println(combinations);
    }
    @Test
    public void combineLarge() throws Exception {
        long time = System.nanoTime();
        List<List<Integer>> combinations = new _77Combinations().combine(20, 16);
        time = System.nanoTime() - time;
        System.out.println(time / 1000000);
        System.out.println(combinations.size());
        System.out.println(combinations);
    }

}