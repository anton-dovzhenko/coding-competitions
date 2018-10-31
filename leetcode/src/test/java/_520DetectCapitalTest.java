import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 19/2/17.
 */
public class _520DetectCapitalTest {
    @Test
    public void detectCapitalUse() throws Exception {

        assertTrue(new _520DetectCapital().detectCapitalUse("USA"));
        assertFalse(new _520DetectCapital().detectCapitalUse("FlaG"));
        assertTrue(new _520DetectCapital().detectCapitalUse("Flag"));
        assertTrue(new _520DetectCapital().detectCapitalUse("flag"));

    }

}