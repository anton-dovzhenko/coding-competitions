import junit.framework.TestCase;

public class _3074AppleRedistributionIntoBoxesTest extends TestCase {

    public void testMinimumBoxes() {
        assertEquals(2, new _3074AppleRedistributionIntoBoxes().minimumBoxes(
                new int[] {1,3,2}, new int[] {4,3,1,5,2}));
        assertEquals(4, new _3074AppleRedistributionIntoBoxes().minimumBoxes(
                new int[] {5,5,5}, new int[] {2,4,2,7}));
    }

}