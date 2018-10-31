package gcj2015.round1a;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 19/12/16.
 */
public class CLoggingTest {

    @Test
    public void testGetTreesToCut() throws Exception {
        assertArrayEquals(new int[] {0, 0, 0, 0, 1}, CLogging.getTreesToCut(Arrays.asList(
                new CLogging.Point(0, 0)
                ,  new CLogging.Point(10, 0)
                ,  new CLogging.Point(10, 10)
                ,  new CLogging.Point(0, 10)
                ,  new CLogging.Point(5, 5))
        ));
        assertArrayEquals(new int[] {0, 0, 0, 0, 3, 0, 0, 0, 0}, CLogging.getTreesToCut(Arrays.asList(
                        new CLogging.Point(0, 0)
                        ,  new CLogging.Point(5, 0)
                        ,  new CLogging.Point(10, 0)
                        ,  new CLogging.Point(0, 5)
                        ,  new CLogging.Point(5, 5)
                        ,  new CLogging.Point(10, 5)
                        ,  new CLogging.Point(0, 10)
                        ,  new CLogging.Point(5, 10)
                        ,  new CLogging.Point(10, 10)
                )
        ));
    }

}