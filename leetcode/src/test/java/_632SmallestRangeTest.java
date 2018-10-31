import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 21/9/18.
 */
public class _632SmallestRangeTest {
    @Test
    public void smallestRange() throws Exception {
        assertArrayEquals(new int[]{20, 24}, new _632SmallestRange().smallestRange(
                Arrays.asList(
                        Arrays.asList(4, 10, 15, 24, 26),
                        Arrays.asList(0, 9, 12, 20),
                        Arrays.asList(5, 18, 22, 30)
                )
        ));
    }

}