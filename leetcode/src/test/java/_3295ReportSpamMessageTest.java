import org.junit.Test;

import static org.junit.Assert.*;

public class _3295ReportSpamMessageTest {

    @Test
    public void reportSpam() {
        assertTrue(new _3295ReportSpamMessage().reportSpam(
                new String[]{"hello", "world", "leetcode"}, new String[]{"world", "hello"}));
        assertFalse(new _3295ReportSpamMessage().reportSpam(
                new String[]{"hello", "world", "fun"}, new String[]{"world", "programming", "\"]"}));
    }

}