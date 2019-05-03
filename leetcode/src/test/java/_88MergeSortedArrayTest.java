import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class _88MergeSortedArrayTest {

    @Test
    public void merge() {
        int[] result = new int[] {1,2,3,0,0,0};
        new _88MergeSortedArray().merge(result, 3, new int[] {2,5,6}, 3);
        System.out.println(Arrays.toString(result));
    }
}