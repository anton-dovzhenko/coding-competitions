import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 28/12/17.
 */
public class _79WordSearchTest {

    @Test
     public void testExist() throws Exception {
        assertTrue(new _79WordSearch().exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        }, "SEE"));
        assertTrue(new _79WordSearch().exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        }, "ABCCED"));
        assertFalse(new _79WordSearch().exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        }, "ABCB"));
    }

    @Test
    public void testExist2() throws Exception {
        assertFalse(new _79WordSearch().exist(new char[][]{
                {'A', 'A'},
                {'A', 'A'}
        }, "AAAAA"));

    }
}