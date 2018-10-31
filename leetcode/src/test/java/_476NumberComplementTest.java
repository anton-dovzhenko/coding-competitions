import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 31/1/17.
 */
public class _476NumberComplementTest {
    @Test
    public void findComplement() throws Exception {
        assertEquals(7, new _476NumberComplement().findComplement(8));
        assertEquals(2, new _476NumberComplement().findComplement(5));
        assertEquals(0, new _476NumberComplement().findComplement(1));
        assertEquals(1, new _476NumberComplement().findComplement(0));
        assertEquals(1, new _476NumberComplement().findComplement(2));
    }

}