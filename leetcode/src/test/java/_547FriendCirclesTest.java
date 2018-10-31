import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 2/4/17.
 */
public class _547FriendCirclesTest {
    @Test
    public void findCircleNum() throws Exception {
//        assertEquals(2, new _547FriendCircles().findCircleNum(
//                new int[][] {{1,1,0}, {1,1,0}, {0,0,1}}));
//        assertEquals(1, new _547FriendCircles().findCircleNum(
//                new int[][] {{1,1,0}, {1,1,1}, {0,1,1}}));
//        assertEquals(2, new _547FriendCircles().findCircleNum(
//                new int[][] {{1,1,0, 0}, {1,1,0,1}, {0,0,1,0}, {0,1,0,1}}));
        assertEquals(1, new _547FriendCircles().findCircleNum(
                new int[][] {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}}));
    }

}