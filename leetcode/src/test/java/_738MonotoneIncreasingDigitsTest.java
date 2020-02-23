import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _738MonotoneIncreasingDigitsTest {

    @Test
    public void monotoneIncreasingDigits() {
        Assert.assertEquals(9, new _738MonotoneIncreasingDigits().monotoneIncreasingDigits(10));
        Assert.assertEquals(1234, new _738MonotoneIncreasingDigits().monotoneIncreasingDigits(1234));
        Assert.assertEquals(299, new _738MonotoneIncreasingDigits().monotoneIncreasingDigits(332));
        Assert.assertEquals(13339, new _738MonotoneIncreasingDigits().monotoneIncreasingDigits(13342));
        Assert.assertEquals(14999, new _738MonotoneIncreasingDigits().monotoneIncreasingDigits(15542));
    }
}