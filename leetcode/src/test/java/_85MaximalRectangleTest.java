import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 19/9/18.
 */
public class _85MaximalRectangleTest {
    @Test
    public void maximalRectangle() throws Exception {
        assertEquals(6, new _85MaximalRectangle().maximalRectangle(new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        }));
        assertEquals(6, new _85MaximalRectangle().maximalRectangle(new char[][]{
                {'1', '0', '1', '0'},
                {'1', '0', '1', '1'},
                {'1', '0', '1', '1'},
                {'1', '1', '1', '1'},
        }));
        assertEquals(12, new _85MaximalRectangle().maximalRectangle(new char[][]{
                {'0', '0', '1', '0'},
                {'1', '1', '1', '1'},
                {'1', '1', '1', '1'},
                {'1', '1', '1', '0'},
                {'1', '1', '0', '0'},
                {'1', '1', '1', '1'},
                {'1', '1', '1', '0'}}));


    }

}