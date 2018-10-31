package gcj2015.round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 24/12/16.
 */
public class BKiddiePoolTest {

    @Test
    public void testGetMinTime() throws Exception {
        assertEquals(50.0, BKiddiePool.getMinTime(1, 10, 50, new double[] {0.2}, new double[] {50}), 1e-9);
        assertEquals(207221.843687375, BKiddiePool.getMinTime(2, 30, 65.4321, new double[] {0.0001, 100}, new double[] {50, 99.9}), 1e-9);
        assertEquals(-1, BKiddiePool.getMinTime(2, 5, 99.9, new double[] {30, 20}, new double[] {99.8999, 99.7}), 1e-9);
        assertEquals(0.5, BKiddiePool.getMinTime(2, 0.0001, 77.2831, new double[] {0.0001, 0.0001}, new double[] {97.3911, 57.1751}), 1e-9);
        assertEquals(1.428034895, BKiddiePool.getMinTime(2, 100, 75.6127, new double[] {70.0263, 27.0364}, new double[] {75.6127, 27.7990}), 1e-9);
    }
}

/*

2 5.0000 99.9000
30.0000 99.8999
20.0000 99.7000


2 0.0001 77.2831
0.0001 97.3911
0.0001 57.1751


2 100.0000 75.6127
70.0263 75.6127
27.0364 27.7990
 */