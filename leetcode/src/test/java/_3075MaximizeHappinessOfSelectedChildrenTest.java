import junit.framework.TestCase;

public class _3075MaximizeHappinessOfSelectedChildrenTest extends TestCase {

    public void testMaximumHappinessSum() {
        assertEquals(4, new _3075MaximizeHappinessOfSelectedChildren().maximumHappinessSum(new int[]{1,2,3}, 2));
        assertEquals(1, new _3075MaximizeHappinessOfSelectedChildren().maximumHappinessSum(new int[]{1,1,1,1}, 2));
        assertEquals(5, new _3075MaximizeHappinessOfSelectedChildren().maximumHappinessSum(new int[]{2,3,4,5}, 1));
    }
}