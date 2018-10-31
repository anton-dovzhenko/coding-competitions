import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 26/6/17.
 */
public class _611ValidTriangleNumberTest {

    @Test
    public void testTriangleNumber() throws Exception {
//        assertEquals(3, new _611ValidTriangleNumber().triangleNumber(new int[]{2, 2, 3, 4}));
//        assertEquals(17, new _611ValidTriangleNumber().triangleNumber(new int[]{82, 15, 23, 82, 67, 0, 3, 92, 11}));
        assertEquals(65, new _611ValidTriangleNumber().triangleNumber(new int[]{66, 99, 36, 44, 26, 99, 32, 64, 19, 69}));
    }
}