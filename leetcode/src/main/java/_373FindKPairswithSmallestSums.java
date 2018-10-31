import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 26/2/18.
 */
public class _373FindKPairswithSmallestSums {

    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<int[]> pairs = new LinkedList<>();
        int count = 0;
        int i1 = 0;
        int i2 = 0;
        int[] ind1 = new int[nums1.length];
        int[] ind2 = new int[nums2.length];
        int target = nums1[i1] + nums2[i2];
        pairs.add(new int[] {nums1[i1], nums2[i2]});
        while (count < k) {
            if (i1 == nums1.length - 1) {
                i2++;
                i1 = ind2[i2];
                ind2[i2]++;
            } else if (i2 == nums2.length - 1) {
                i1++;
                i2 = ind1[i1];
                ind1[i1]++;
            } else {

            }

            count++;
        }

        return pairs;

    }

    // 1 2 30
    // 1 10 20

    // [1, 1], [2, 1], [3, 1],
}
