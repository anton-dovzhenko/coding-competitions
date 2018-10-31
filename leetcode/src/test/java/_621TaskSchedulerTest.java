import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 3/7/17.
 */
public class _621TaskSchedulerTest {

    @Test
    public void testLeastInterval() throws Exception {
        assertEquals(8, new _621TaskScheduler()
                .leastInterval(new char[] {'A','A','A','B','B','B'}, 2));
    }
}