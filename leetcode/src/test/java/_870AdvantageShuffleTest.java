import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 15/7/18.
 */
public class _870AdvantageShuffleTest {
    @Test
    public void advantageCount() throws Exception {
        assertArrayEquals(new int[] {2,11,7,15}, new _870AdvantageShuffle()
                .advantageCount(new int[] {2,7,11,15}, new int[] {1,10,4,11}));
        assertArrayEquals(new int[] {24,32,8,12}, new _870AdvantageShuffle()
                .advantageCount(new int[] {12,24,8,32}, new int[] {13,25,32,11}));
         new _870AdvantageShuffle()
                .advantageCount(new int[] {2,0,4,1,2}, new int[] {1,3,0,0,2});
    }

}

