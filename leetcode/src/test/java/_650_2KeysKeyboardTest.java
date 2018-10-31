import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 25/1/18.
 */
public class _650_2KeysKeyboardTest {

    @Test
    public void testMinSteps() throws Exception {
        assertEquals(3, new _650_2KeysKeyboard().minSteps(3));
        assertEquals(9, new _650_2KeysKeyboard().minSteps(27));
        assertEquals(13, new _650_2KeysKeyboard().minSteps(13));
        assertEquals(6, new _650_2KeysKeyboard().minSteps(8));
    }
}