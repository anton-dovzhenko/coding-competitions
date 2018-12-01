import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 1/12/18.
 */
public class _528RandomPickwithWeightTest {
    @Test
    public void pickIndex() throws Exception {
//        System.out.println(Arrays.binarySearch(new int[] {0, 5, 10, 20, 100}, -1));
//        System.out.println(Arrays.binarySearch(new int[] {0, 5, 10, 20, 100}, 0));
//        System.out.println(Arrays.binarySearch(new int[] {0, 5, 10, 20, 100}, 1));
//        System.out.println(Arrays.binarySearch(new int[] {0, 5, 10, 20, 100}, 5));
//        System.out.println(Arrays.binarySearch(new int[] {0, 5, 10, 20, 100}, 6));
//        System.out.println(Arrays.binarySearch(new int[] {0, 5, 10, 20, 100}, 10));
//        System.out.println(Arrays.binarySearch(new int[] {0, 5, 10, 20, 100}, 95));
//        System.out.println(Arrays.binarySearch(new int[] {0, 5, 10, 20, 100}, 100));
//        System.out.println(Arrays.binarySearch(new int[] {0, 5, 10, 20, 100}, 200));
        _528RandomPickwithWeight s = new _528RandomPickwithWeight(new int[]{1, 3});
        for (int i = 0; i < 20; i++) {
            System.out.print(s.pickIndex() + " ");
        }
    }

}