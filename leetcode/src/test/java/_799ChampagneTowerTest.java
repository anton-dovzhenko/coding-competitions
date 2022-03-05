import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _799ChampagneTowerTest {

    @Test
    public void champagneTower() {
        Assert.assertEquals(0d, new _799ChampagneTower().champagneTower(1, 1, 1), 1e-6);
        Assert.assertEquals(0.5, new _799ChampagneTower().champagneTower(2, 1, 1), 1e-6);
    }

}