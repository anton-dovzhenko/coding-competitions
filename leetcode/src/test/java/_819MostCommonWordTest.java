import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 15/4/18.
 */
public class _819MostCommonWordTest {

    @Test
    public void testMostCommonWord() throws Exception {
        assertEquals("ball", new _819MostCommonWord().mostCommonWord(
                "Bob hit a ball, the.hit;BALL,flew'far?after!it was hit.", new String[]{"hit"}));
    }
}