import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 17/6/18.
 */
public class _849MaximizeDistancetoClosestPersonTest {

    @Test
    public void maxDistToClosest() throws Exception {
        assertEquals(2, new _849MaximizeDistancetoClosestPerson().maxDistToClosest(new int[] {1,0,0,0,1,0,1}));
        assertEquals(3, new _849MaximizeDistancetoClosestPerson().maxDistToClosest(new int[] {1,0,0,0}));
        assertEquals(3, new _849MaximizeDistancetoClosestPerson().maxDistToClosest(new int[] {0,0,0,1}));
        assertEquals(2, new _849MaximizeDistancetoClosestPerson().maxDistToClosest(new int[] {1,0,0,0,1}));
    }

}