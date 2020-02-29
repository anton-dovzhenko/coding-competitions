import org.junit.Test;

import static org.junit.Assert.*;

public class _306AdditiveNumberTest {

    @Test
    public void isAdditiveNumber() {
        assertTrue(new _306AdditiveNumber().isAdditiveNumber("112358"));
        assertTrue(new _306AdditiveNumber().isAdditiveNumber("199100199"));
        assertFalse(new _306AdditiveNumber().isAdditiveNumber("1023"));
        assertTrue(new _306AdditiveNumber().isAdditiveNumber("101"));
        assertTrue(new _306AdditiveNumber().isAdditiveNumber("011235"));
        assertTrue(new _306AdditiveNumber().isAdditiveNumber("000"));
        assertTrue(new _306AdditiveNumber().isAdditiveNumber("101"));
        assertFalse(new _306AdditiveNumber().isAdditiveNumber("0235813"));
        assertTrue(new _306AdditiveNumber().isAdditiveNumber("199111992"));
    }
}