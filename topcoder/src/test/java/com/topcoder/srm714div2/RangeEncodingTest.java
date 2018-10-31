package com.topcoder.srm714div2;

import static org.junit.Assert.*;

/**
 * Created by anton on 19/5/17.
 */
public class RangeEncodingTest {

    @org.junit.Test
    public void minRanges() throws Exception {
        assertEquals(1, new RangeEncoding().minRanges(new int[] {1,2,3,4,5,6,7,8,9,10}));
        assertEquals(6, new RangeEncoding().minRanges(new int[] {1,6,10,20,32,49}));
        assertEquals(4, new RangeEncoding().minRanges(new int[] {2,4,5,6,8,9,10,11,12,15}));
        assertEquals(14, new RangeEncoding().minRanges(new int[] {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47}));
        assertEquals(4, new RangeEncoding().minRanges(new int[] {10,11,12,13,14,15,20,21,22,23,25,27,28,29,30,31,32,33}));
        assertEquals(1, new RangeEncoding().minRanges(new int[] {33}));
    }

}