import org.junit.Assert;
import org.junit.Test;

public class _223RectangleAreaTest {

    @Test
    public void computeArea() {
        Assert.assertEquals(45, new _223RectangleArea().computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
        Assert.assertEquals(26, new _223RectangleArea().computeArea(0, 0, 5, 5, 10, 10, 11, 11));
        Assert.assertEquals(27, new _223RectangleArea().computeArea(0, 0, 5, 5, 1, -1, 2, 6));
        Assert.assertEquals(2, new _223RectangleArea().computeArea(-1500000001, 0, -1500000000, 1, 1500000000, 0, 1500000001, 1));
    }
}