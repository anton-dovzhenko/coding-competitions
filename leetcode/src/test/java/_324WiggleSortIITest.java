import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 14/5/18.
 */
public class _324WiggleSortIITest {
    @Test
    public void wiggleSort() throws Exception {
        int[] array = new int[] {2, 1};
        new _324WiggleSortII().wiggleSort(array);
        System.out.println(Arrays.toString(array));
        array = new int[] {5, 4, 3, 2, 1};
        new _324WiggleSortII().wiggleSort(array);
        System.out.println(Arrays.toString(array));
        array = new int[] {1, 5, 1, 1, 6, 4};
        new _324WiggleSortII().wiggleSort(array);
        System.out.println(Arrays.toString(array));
        array = new int[] {4, 5, 5, 6};
        new _324WiggleSortII().wiggleSort(array);
        System.out.println(Arrays.toString(array));
        array = new int[] {2,3,3,2,2,2,1,1};
        new _324WiggleSortII().wiggleSort(array);
        System.out.println(Arrays.toString(array));
    }

}