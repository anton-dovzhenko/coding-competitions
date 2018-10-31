package gcj2015.round3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 2/1/17.
 */
public class AFairlandTest {
    @Test
    public void getEmployeesNumber() throws Exception {
        AFairland fairland = new AFairland();
        fairland.getEmployeesNumber(6, 5, 10, 1, 3, 17, 5, 2, 7, 19);
        boolean b = true;
    }

}