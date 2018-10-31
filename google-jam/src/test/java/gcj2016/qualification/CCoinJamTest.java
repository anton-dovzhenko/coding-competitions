package gcj2016.qualification;

import gcj2016.qualification.CCoinJam;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by anton on 10/1/17.
 */
public class CCoinJamTest {

    @Test
    public void getCoinJams() throws Exception {
        List<CCoinJam.CoinJam> result = CCoinJam.getCoinJams(6, 3);
        System.out.println(result);
    }

    @Test
    public void validateTest() {
        assertFalse(CCoinJam.validate(0b101, 3).valid);
        assertTrue(CCoinJam.validate(0b1001, 4).valid);
        assertFalse(CCoinJam.validate(0b110111, 6).valid);
        assertTrue(CCoinJam.validate(0b110011, 6).valid);
    }


}