import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 8/10/18.
 */
public class _115DistinctSubsequencesTest {
    @Test
    public void numDistinct() throws Exception {
        assertEquals(2, new _115DistinctSubsequences().numDistinct("rra", "ra"));
        assertEquals(3, new _115DistinctSubsequences().numDistinct("rabbbit", "rabbit"));
        assertEquals(5, new _115DistinctSubsequences().numDistinct("babgbag", "bag"));
    }

}