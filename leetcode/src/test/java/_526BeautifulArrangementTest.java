import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 20/2/17.
 */
public class _526BeautifulArrangementTest {
    @Test
    public void countArrangement() throws Exception {
        //assertEquals(22, new _526BeautifulArrangement().countArrangement(6));
        //assertEquals(2, new _526BeautifulArrangement().countArrangement(2));
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " = " + new _526BeautifulArrangement().countArrangement(i));
        }
    }

}