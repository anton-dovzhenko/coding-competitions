package gcj2016.round1a;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 14/1/17.
 */
public class ATheLastWordTest {

    @Test
    public void getLastWord() throws Exception {
        assertEquals("CAB", ATheLastWord.getLastWord("CAB"));
        assertEquals("MJA", ATheLastWord.getLastWord("JAM"));
        assertEquals("OCDE", ATheLastWord.getLastWord("CODE"));
        assertEquals("BBAAA", ATheLastWord.getLastWord("ABAAB"));
        assertEquals("CCCABBBAB", ATheLastWord.getLastWord("CABCBBABC"));
        assertEquals("CCCBAABAB", ATheLastWord.getLastWord("ABCABCABC"));
        assertEquals("ZXCASDQWE", ATheLastWord.getLastWord("ZXCASDQWE"));
    }

}