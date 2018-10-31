import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by anton on 6/5/18.
 */
public class _830PositionsofLargeGroupsTest {

    @Test
    public void testLargeGroupPositions() throws Exception {
       List<List<Integer>> list = new _830PositionsofLargeGroups().largeGroupPositions("abbxxxxzzy");
        System.out.println(list);
        list = new _830PositionsofLargeGroups().largeGroupPositions("abc");
        System.out.println(list);
        list = new _830PositionsofLargeGroups().largeGroupPositions("abcdddeeeeaabbbcddd");
        System.out.println(list);
    }
}