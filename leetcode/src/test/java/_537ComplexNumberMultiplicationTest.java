import org.junit.Test;

import static org.junit.Assert.*;

public class _537ComplexNumberMultiplicationTest {

    @Test
    public void complexNumberMultiply() {

        assertEquals("0+2i", new _537ComplexNumberMultiplication().complexNumberMultiply("1+1i", "1+1i"));
        assertEquals("0+-2i", new _537ComplexNumberMultiplication().complexNumberMultiply("1+-1i", "1+-1i"));
    }
}