import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 29/8/17.
 */
public class _171ExcelSheetColumnNumberTest {

    @Test
    public void testTitleToNumber() throws Exception {
        assertEquals(27, new _171ExcelSheetColumnNumber().titleToNumber("AA"));
        assertEquals(28, new _171ExcelSheetColumnNumber().titleToNumber("AB"));
    }
}