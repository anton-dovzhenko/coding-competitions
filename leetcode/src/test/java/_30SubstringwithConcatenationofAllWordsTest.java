import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by anton on 17/9/18.
 */
public class _30SubstringwithConcatenationofAllWordsTest {
    @Test
    public void findSubstring() throws Exception {
        assertEquals(Arrays.asList(0, 9), new _30SubstringwithConcatenationofAllWords().findSubstring(
                "barfoothefoobarman",
                new String[]{"foo", "bar"}));
        assertEquals(new LinkedList<Integer>(), new _30SubstringwithConcatenationofAllWords().findSubstring(
                "barfokothefoosbarman",
                new String[]{"foo", "bar"}));
        assertEquals(Arrays.asList(8), new _30SubstringwithConcatenationofAllWords().findSubstring(
                "wordgoodgoodgoodbestword",
                new String[]{"word", "good", "best", "good"}));
    }

}