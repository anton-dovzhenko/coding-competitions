import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 5/9/18.
 */
public class _890FindAndReplacePatternTest {
    @Test
    public void findAndReplacePattern() throws Exception {
        assertEquals(Arrays.asList("cd"), new _890FindAndReplacePattern()
                .findAndReplacePattern(new String[]{"cd", "gg"}, "ab"));
    }

}