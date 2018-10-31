import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 13/5/18.
 */
public class _832FlippingAnImageTest {
    @Test
    public void flipAndInvertImage() throws Exception {
        int[][] A = new _832FlippingAnImage().flipAndInvertImage(new int[][] {{1, 0, 0, 1}});
        System.out.println(Arrays.toString(A[0]));
        A = new _832FlippingAnImage().flipAndInvertImage(new int[][] {{1, 1, 0}});
        System.out.println(Arrays.toString(A[0]));
    }

}