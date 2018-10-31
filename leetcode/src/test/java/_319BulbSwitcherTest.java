import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 16/7/18.
 */
public class _319BulbSwitcherTest {
    @Test
    public void bulbSwitch() throws Exception {
        assertEquals(1, new _319BulbSwitcher().bulbSwitch(3));
        assertEquals(2, new _319BulbSwitcher().bulbSwitch(4));
    }

}