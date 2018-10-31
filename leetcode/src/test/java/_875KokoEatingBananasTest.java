import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 8/8/18.
 */
public class _875KokoEatingBananasTest {
    @Test
    public void minEatingSpeed() throws Exception {
        assertEquals(4, new _875KokoEatingBananas().minEatingSpeed(new int[] {3, 6, 7, 11}, 8));
    }

}