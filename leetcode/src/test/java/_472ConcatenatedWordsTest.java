import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 13/11/17.
 */
public class _472ConcatenatedWordsTest {

    @Test
    public void testFindAllConcatenatedWordsInADict() throws Exception {
        assertEquals(Arrays.asList("catsdogcats","dogcatsdog","ratcatdogcat")
                , new _472ConcatenatedWords().findAllConcatenatedWordsInADict(new String[] {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"}));
    }
}