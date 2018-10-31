import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 29/4/18.
 */
public class _825FriendsOfAppropriateAgesTest {

    @Test
    public void testNumFriendRequests() throws Exception {
//        assertEquals(2, new _825FriendsOfAppropriateAges().numFriendRequests(new int[] {16, 16}));
        assertEquals(2, new _825FriendsOfAppropriateAges().numFriendRequests(new int[] {16, 17, 18}));
//        assertEquals(3, new _825FriendsOfAppropriateAges().numFriendRequests(new int[] {20,30,100,110,120}));
    }
}