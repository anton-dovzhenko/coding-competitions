import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 24/11/18.
 */
public class _354RussianDollEnvelopesTest {
    @Test
    public void maxEnvelopes() throws Exception {
        assertEquals(3, new _354RussianDollEnvelopes().maxEnvelopes(new int[][] {{5, 4}, {6, 4}, {6, 7}, {2, 3}}));
        assertEquals(3, new _354RussianDollEnvelopes().maxEnvelopes(new int[][] {{46,89},{50,53},{52,68},{72,45},{77,81}}));
    }

}