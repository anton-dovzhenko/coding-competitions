import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 22/4/18.
 */
public class _820ShortEncodingofWordsTest {

    @Test
    public void testMinimumLengthEncoding() throws Exception {
        assertEquals(10, new _820ShortEncodingofWords()
                .minimumLengthEncoding(new String[] {"time", "me", "bell"}));
        assertEquals(12, new _820ShortEncodingofWords()
                .minimumLengthEncoding(new String[] {"time", "atime", "btime"}));
    }
}