import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 21/9/17.
 */
public class _648ReplaceWordsTest {

    @Test
    public void replaceWordsTest() {
        assertEquals("the cat was rat by the bat"
                , new _648ReplaceWords().replaceWords(Arrays.asList("cat", "bat", "rat"), "the cattle was rattled by the battery"));
    }

}