import org.junit.Test;

import static org.junit.Assert.*;

public class _6ZigZagConversionTest {

    @Test
    public void convert() {
        assertEquals("PAHNAPLSIIGYIR", new _6ZigZagConversion().convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", new _6ZigZagConversion().convert("PAYPALISHIRING", 4));
        assertEquals("PAYPALISHIRING", new _6ZigZagConversion().convert("PAYPALISHIRING", 1));
        assertEquals("ABCED", new _6ZigZagConversion().convert("ABCDE", 4));
    }

}