import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class _2100FindGoodDaystoRobtheBankTest {

    @Test
    public void goodDaysToRobBank() {
        Assert.assertEquals(Arrays.asList(2, 3), new _2100FindGoodDaystoRobtheBank().goodDaysToRobBank(new int[] {5,3,3,3,5,6,2}, 2));
        Assert.assertEquals(Arrays.asList(0, 1, 2, 3, 4), new _2100FindGoodDaystoRobtheBank().goodDaysToRobBank(new int[] {1,1,1,1,1}, 0));
        Assert.assertEquals(Arrays.asList(), new _2100FindGoodDaystoRobtheBank().goodDaysToRobBank(new int[] {1,2,3,4,5,6}, 2));
    }

}