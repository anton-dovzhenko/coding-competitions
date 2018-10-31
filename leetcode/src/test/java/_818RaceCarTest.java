import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 14/10/18.
 */
public class _818RaceCarTest {
    @Test
    public void racecar() throws Exception {
        assertEquals(2, new _818RaceCar().racecar(3));
        assertEquals(5, new _818RaceCar().racecar(6));
        assertEquals(5, new _818RaceCar().racecar(4));
    }

}