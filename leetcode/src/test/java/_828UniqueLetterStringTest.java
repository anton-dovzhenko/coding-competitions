import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 6/5/18.
 */
public class _828UniqueLetterStringTest {

    @Test
    public void testUniqueLetterString() throws Exception {
        assertEquals(10, new _828UniqueLetterString().uniqueLetterString4("ABC"));
        assertEquals(8, new _828UniqueLetterString().uniqueLetterString4("ABA"));
    }
}