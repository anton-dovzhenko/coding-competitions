import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _402RemoveKDigitsTest {

    @Test
    public void removeKdigits() {
        Assert.assertEquals("1219", new _402RemoveKDigits().removeKdigits("1432219", 3));
        Assert.assertEquals("200", new _402RemoveKDigits().removeKdigits("10200", 1));
        Assert.assertEquals("0", new _402RemoveKDigits().removeKdigits("10", 2));
        Assert.assertEquals("0", new _402RemoveKDigits().removeKdigits("9", 1));
        Assert.assertEquals("107", new _402RemoveKDigits().removeKdigits("1107", 1));
    }
}