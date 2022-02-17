import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class _386LexicographicalNumbersTest {

    @Test
    public void lexicalOrder() {
        Assert.assertEquals(Arrays.asList(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9),
                new _386LexicographicalNumbers().lexicalOrder(13));
    }
}