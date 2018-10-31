import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 17/10/18.
 */
public class _224BasicCalculatorTest {
    @Test
    public void calculate() throws Exception {
        assertEquals(2, new _224BasicCalculator().calculate("1 + 1"));
        assertEquals(3, new _224BasicCalculator().calculate("2-1+2"));
        assertEquals(23, new _224BasicCalculator().calculate("(1+(4+5+2)-3)+(6+8)"));
        assertEquals(-5, new _224BasicCalculator().calculate("(1+(4+5+2)-3)-(6+8)"));
        assertEquals(5, new _224BasicCalculator().calculate("(1+(4+5+2)-3)-(6+8) + 10"));
    }

}