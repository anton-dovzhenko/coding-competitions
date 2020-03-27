import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _679_24GameTest {

    @Test
    public void judgePoint24() {
//        Assert.assertTrue(new _679_24Game().judgePoint24(new int[] {4, 1, 8, 7}));
//        Assert.assertFalse(new _679_24Game().judgePoint24(new int[] {1, 2, 1, 2}));
        Assert.assertFalse(new _679_24Game().judgePoint24(new int[] {1, 5, 9, 1}));
    }
}