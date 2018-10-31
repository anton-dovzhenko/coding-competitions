import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 1/4/17.
 */
public class _273IntegerToEnglishWordsTest {
    @Test
    public void numberToWords() throws Exception {
        assertEquals("One Thousand", new _273IntegerToEnglishWords().numberToWords(1_000));
        assertEquals("One Thousand One", new _273IntegerToEnglishWords().numberToWords(1_001));
        assertEquals("One Thousand Ten", new _273IntegerToEnglishWords().numberToWords(1010));
        assertEquals("One Thousand Fifteen", new _273IntegerToEnglishWords().numberToWords(1015));
        assertEquals("One Thousand Ninety Nine", new _273IntegerToEnglishWords().numberToWords(1099));
        assertEquals("One Thousand Nine Hundred Ninety Nine", new _273IntegerToEnglishWords().numberToWords(1999));
        assertEquals("One Million", new _273IntegerToEnglishWords().numberToWords(1_000_000));
    }

}