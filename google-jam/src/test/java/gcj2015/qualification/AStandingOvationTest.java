package gcj2015.qualification;

import static org.junit.Assert.*;

/**
 * Created by anton on 12/12/16.
 */
public class AStandingOvationTest {

    @org.junit.Test
    public void testGetAdditionalFriends() throws Exception {
        assertEquals(0, AStandingOvation.getAdditionalFriends(new int[] {1, 1, 1, 1, 1}));
        assertEquals(1, AStandingOvation.getAdditionalFriends(new int[] {0, 9}));
        assertEquals(2, AStandingOvation.getAdditionalFriends(new int[] {1, 1, 0, 0, 1, 1}));
        assertEquals(0, AStandingOvation.getAdditionalFriends(new int[] {1}));
    }
}