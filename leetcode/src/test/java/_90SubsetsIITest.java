import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by anton on 18/3/17.
 */
public class _90SubsetsIITest {

    @Test
    public void subsetsWithDup() throws Exception {
        List<List<Integer>> result = new _90SubsetsII().subsetsWithDup(new int[] {1, 2, 2, 2});
        System.out.println(result);
//        List<List<Integer>> result = new _90SubsetsII().subsetsWithDup(new int[] {1, 2, 2, 2});
//        System.out.println(result);
    }

}