/**
 * Created by anton on 5/2/17.
 */
public class _4MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int i1 = 0;
        int i2 = 0;
        int val1 = -1;
        int val2 = -1;
        for (int i = 0; i < length / 2 + 1; i++) {
            val1 = val2;
            if (i1 == nums1.length) {
                val2 = nums2[i2++];
            } else if (i2 == nums2.length) {
                val2 = nums1[i1++];
            } else {
                int temp1 = nums1[i1];
                int temp2 = nums2[i2];
                if (temp1 > temp2) {
                    val2 = temp2;
                    i2++;
                } else {
                    val2 = temp1;
                    i1++;
                }
            }
        }
        return length % 2 == 1 ? val2 : 0.5 * (val1 + val2);
    }

}
