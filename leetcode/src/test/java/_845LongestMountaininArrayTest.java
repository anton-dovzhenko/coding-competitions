import org.junit.Assert;
import org.junit.Test;

public class _845LongestMountaininArrayTest {

    @Test
    public void longestMountain() {
        Assert.assertEquals(5, new _845LongestMountaininArray().longestMountain(new int[]{2, 1, 4, 7, 3, 2, 5}));
        Assert.assertEquals(0, new _845LongestMountaininArray().longestMountain(new int[]{2, 2, 2}));
        Assert.assertEquals(4, new _845LongestMountaininArray().longestMountain(new int[]{875, 884, 239, 731, 723, 685}));
    }

}