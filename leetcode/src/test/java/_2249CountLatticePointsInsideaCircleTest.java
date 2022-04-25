import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _2249CountLatticePointsInsideaCircleTest {

    @Test
    public void countLatticePoints() {
        Assert.assertEquals(16,
                new _2249CountLatticePointsInsideaCircle().countLatticePoints(new int[][] {{2, 2, 2}, {3, 4, 1}} ));
    }

}