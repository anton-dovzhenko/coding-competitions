package gcj2017.round1A;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 15/4/17.
 */
public class BTest {

    @Test
    public void testGetPackNumber1() throws Exception {
        int N = 2;
        int P = 1;
        int[] standard = {500, 300};
        int[][] Q = new int[][] {{900}, {660}};
        int num = B.getPackNumber(N, P, standard, Q);
        assertEquals(1, num);
    }

    @Test
    public void testGetPackNumber2() throws Exception {
        int N = 2;
        int P = 1;
        int[] standard = {500, 300};
        int[][] Q = new int[][] {{1500}, {809}};
        int num = B.getPackNumber(N, P, standard, Q);
        assertEquals(0, num);
    }

    @Test
    public void testGetPackNumber3() throws Exception {
        int N = 2;
        int P = 2;
        int[] standard = {50, 100};
        int[][] Q = new int[][] {{450, 449}, {1100, 1101}};
        int num = B.getPackNumber(N, P, standard, Q);
        assertEquals(1, num);
    }


    @Test
     public void testGetPackNumber4() throws Exception {
        int N = 2;
        int P = 1;
        int[] standard = {500, 300};
        int[][] Q = new int[][] {{300}, {500}};
        int num = B.getPackNumber(N, P, standard, Q);
        assertEquals(0, num);
    }

    @Test
    public void testGetPackNumber5() throws Exception {
        int N = 1;
        int P = 8;
        int[] standard = {10};
        int[][] Q = new int[][] {{11, 13, 17, 11, 16, 14, 12, 18}};
        int num = B.getPackNumber(N, P, standard, Q);
        assertEquals(3, num);
    }

}