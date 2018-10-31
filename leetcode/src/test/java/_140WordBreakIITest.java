import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 24/1/18.
 */
public class _140WordBreakIITest {

    @Test
    public void testWordBreak() throws Exception {
        System.out.println(new _140WordBreakII().wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog")));
        System.out.println(new _140WordBreakII().wordBreak("aaaaaaa", Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa")));
        System.out.println(new _140WordBreakII().wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaa", Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa")));
    }
}