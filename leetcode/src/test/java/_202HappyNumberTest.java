import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 22/2/17.
 */
public class _202HappyNumberTest {

    @Test
    public void isHappy() throws Exception {
        assertTrue(new _202HappyNumber().isHappy(1));
        assertTrue(new _202HappyNumber().isHappy(19));
        assertFalse(new _202HappyNumber().isHappy(2));
        assertFalse(new _202HappyNumber().isHappy(3));
    }

}