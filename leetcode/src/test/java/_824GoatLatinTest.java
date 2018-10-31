import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 29/4/18.
 */
public class _824GoatLatinTest {

    @Test
    public void testToGoatLatin() throws Exception {
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", new _824GoatLatin().toGoatLatin("I speak Goat Latin"));
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
                , new _824GoatLatin().toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}