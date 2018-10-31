import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by anton on 6/10/18.
 */
public class _218TheSkylineProblemTest {

    @Test
    public void getSkyline() throws Exception {
        List<int[]> actual = null;

        actual = new _218TheSkylineProblem().getSkyline(new int[][] {{2, 9, 10}
            , {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}});
        for (int i = 0; i < actual.size(); i++) {
            System.out.println(Arrays.toString(actual.get(i)));
        }

        System.out.println("----------------");
        actual = new _218TheSkylineProblem().getSkyline(new int[][] {{0, 2, 3}, {2, 5, 3}});
        for (int i = 0; i < actual.size(); i++) {
            System.out.println(Arrays.toString(actual.get(i)));
        }

        System.out.println("----------------");
        actual = new _218TheSkylineProblem().getSkyline(new int[][] {{1, 2, 1}, {1, 2, 2}, {1, 2, 3}});
        for (int i = 0; i < actual.size(); i++) {
            System.out.println(Arrays.toString(actual.get(i)));
        }

        System.out.println("----------------");
        actual = new _218TheSkylineProblem().getSkyline(new int[][] {{0, 1, 3}});
        for (int i = 0; i < actual.size(); i++) {
            System.out.println(Arrays.toString(actual.get(i)));
        }
    }

}

//[2, 10]
//[3, 15]
//[7, 12]
//[12, 0]
//[15, 10]
//[20, 8]
//[24, 0]


//[3, 15]
//[7, 12]
//[12, 0]
//[15, 10]
//[20, 8]
//[24, 0]
//----------------
//[5, 0]
//----------------
//[1, 3]
//[2, 0]