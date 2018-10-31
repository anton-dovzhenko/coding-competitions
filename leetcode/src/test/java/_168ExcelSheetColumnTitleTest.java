import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 29/8/17.
 */
public class _168ExcelSheetColumnTitleTest {

    @Test
    public void testConvertToTitle() throws Exception {
        assertEquals("A", new _168ExcelSheetColumnTitle().convertToTitle(1));
        assertEquals("Z", new _168ExcelSheetColumnTitle().convertToTitle(26));
        assertEquals("AA", new _168ExcelSheetColumnTitle().convertToTitle(27));
        assertEquals("AB", new _168ExcelSheetColumnTitle().convertToTitle(28));
    }
}