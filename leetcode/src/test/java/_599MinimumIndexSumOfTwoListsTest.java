import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 8/7/17.
 */
public class _599MinimumIndexSumOfTwoListsTest {


    @Test
    public void findRestaurantTest() {
        assertArrayEquals(new String[] {"Shogun"}
                , new _599MinimumIndexSumOfTwoLists().findRestaurant(new String[] {"Shogun","Tapioca Express","Burger King","KFC"}
                , new String[] {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"}));
    }

}