import junit.framework.TestCase;

public class _3219MinimumCostАorCuttingCakeIITest extends TestCase {

    public void testMinimumCost() {
        assertEquals(13, new _3218MinimumCostForCuttingCakeI().minimumCost(3, 2,
                new int[] {1, 3}, new int[] {5}));
        assertEquals(15, new _3218MinimumCostForCuttingCakeI().minimumCost(2, 2,
                new int[] {7}, new int[] {4}));
        assertEquals(28, new _3218MinimumCostForCuttingCakeI().minimumCost(6, 3,
                new int[]{2, 3, 2, 3, 1}, new int[]{1, 2}));
    }

}