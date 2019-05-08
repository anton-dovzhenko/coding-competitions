import org.junit.Test;

import static org.junit.Assert.*;

public class _97InterleavingStringTest {

    @Test
    public void isInterleave() {
//        assertTrue(new _97InterleavingString().isInterleave("aabcc", "dbbca", "aadbbcbcac"));
//        assertFalse(new _97InterleavingString().isInterleave("aabcc", "dbbca", "aadbbbaccc"));
//        assertTrue(new _97InterleavingString().isInterleave("", "", ""));
        assertTrue(new _97InterleavingString().isInterleave("cbcccbabbccbbcccbbbcabbbabcababbbbbbaccaccbabbaacbaabbbc"
                , "abcbbcaababccacbaaaccbabaabbaaabcbababbcccbbabbbcbbb"
                , "abcbcccbacbbbbccbcbcacacbbbbacabbbabbcacbcaabcbaaacbcbbbabbbaacacbbaaaabccbcbaabbbaaabbcccbcbabababbbcbbbcbb"));

    }
}