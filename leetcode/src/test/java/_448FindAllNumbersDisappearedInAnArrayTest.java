import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 1/2/17.
 */
public class _448FindAllNumbersDisappearedInAnArrayTest {

    @Test
    public void findDisappearedNumbers2() throws Exception {
        assertEquals(new ArrayList<>(Arrays.asList(5, 6))
                , new _448FindAllNumbersDisappearedInAnArray().findDisappearedNumbers2(new int[] {4,3,2,7,8,2,3,1}));
        assertEquals(new ArrayList<>(Arrays.asList(4,5,6,7,8))
                , new _448FindAllNumbersDisappearedInAnArray().findDisappearedNumbers2(new int[] {1,1,1,1,1,2,2,3}));
    }

}