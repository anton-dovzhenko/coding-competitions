package com.topcoder.srm714div2;

/**
 * Submission was successful for 236.74 points
 */
public class RangeEncoding {

    public int minRanges(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1] + 1) {
                count++;
            }
        }

        return count;
    }
}
