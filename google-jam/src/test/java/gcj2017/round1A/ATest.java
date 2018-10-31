package gcj2017.round1A;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 15/4/17.
 */
public class ATest {

    @Test
    public void testSetInitials() throws Exception {
        char[][] cake = new char[][]{{'G', '?', '?'}, {'?', 'C', '?'}, {'?', '?', 'J'}};
        A.setInitials(cake, 3, 3);
        System.out.println(Arrays.toString(cake));

        cake = new char[][]{{'C', 'O', 'D', 'E'}, {'?', '?', '?', '?'}, {'?', 'J', 'A', 'M'}};
        A.setInitials(cake, 3, 4);
        System.out.println(Arrays.toString(cake));


        cake = new char[][]{{'C', '?', 'C', 'E'}, {'?', '?', '?', '?'}, {'K', 'J', 'A', 'M'}};
        A.setInitials(cake, 3, 4);
        System.out.println(Arrays.toString(cake));
    }
}