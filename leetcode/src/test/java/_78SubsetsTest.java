import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by anton on 18/3/17.
 */
public class _78SubsetsTest {
    @Test
    public void subsets() throws Exception {

        List<List<Integer>> result = new _78Subsets().subsets(new int[] {0, 1, 2});
        System.out.println(result);
        result = new _78Subsets().subsets(new int[] {1, 2});
        System.out.println(result);

    }

}