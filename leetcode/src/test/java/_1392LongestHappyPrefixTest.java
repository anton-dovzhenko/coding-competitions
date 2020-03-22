import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _1392LongestHappyPrefixTest {

    @Test
    public void longestPrefix() {
        Assert.assertEquals("l", new _1392LongestHappyPrefix().longestPrefix("level"));
        Assert.assertEquals("abab", new _1392LongestHappyPrefix().longestPrefix("ababab"));
        Assert.assertEquals("leet", new _1392LongestHappyPrefix().longestPrefix("leetcodeleet"));
        Assert.assertEquals("", new _1392LongestHappyPrefix().longestPrefix("a"));
    }
}