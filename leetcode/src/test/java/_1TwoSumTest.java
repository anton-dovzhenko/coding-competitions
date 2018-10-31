import static org.junit.Assert.*;

/**
 * Created by anton on 12/1/17.
 */
public class _1TwoSumTest {

    @org.junit.Test
    public void twoSum() throws Exception {
        assertArrayEquals(new int[] {1, 2}, new _1TwoSum().twoSum(new int[] {3,2,4}, 6));
        assertArrayEquals(new int[] {0, 3}, new _1TwoSum().twoSum(new int[] {0, 4, 3, 0}, 0));
        assertArrayEquals(new int[] {3, 4}, new _1TwoSum().twoSum(new int[] {2,1,9,4,4,56,90,3}, 8));
    }

    @org.junit.Test
    public void twoSumBinarySearch() throws Exception {
        assertArrayEquals(new int[] {1, 2}, new _1TwoSum().twoSumBinarySearch(new int[] {3,2,4}, 6));
        assertArrayEquals(new int[] {0, 3}, new _1TwoSum().twoSumBinarySearch(new int[] {0, 4, 3, 0}, 0));
        assertArrayEquals(new int[] {3, 4}, new _1TwoSum().twoSumBinarySearch(new int[] {2,1,9,4,4,56,90,3}, 8));
    }

}