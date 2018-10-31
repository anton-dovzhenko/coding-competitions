import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 1/2/17.
 */
public class _389FindTheDifferenceTest {

    @Test
    public void findTheDifference() throws Exception {
        assertEquals('e', new _389FindTheDifference().findTheDifference("abcd", "abcde"));
        assertEquals('e', new _389FindTheDifference().findTheDifference("aaabbbcccd", "caacbbcadeb"));
    }

    @Test
    public void findTheDifference2() throws Exception {
        assertEquals('e', new _389FindTheDifference().findTheDifference2("abcd", "abcde"));
        assertEquals('e', new _389FindTheDifference().findTheDifference2("aaabbbcccd", "caacbbcadeb"));
    }

}