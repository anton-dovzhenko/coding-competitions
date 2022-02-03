import org.junit.Assert;
import org.junit.Test;


public class _1887ReductionOperationstoMaketheArrayElementsEqualTest {

    @Test
    public void reductionOperations() {
        Assert.assertEquals(3, new _1887ReductionOperationstoMaketheArrayElementsEqual().reductionOperations(new int[] {5,1,3}));
        Assert.assertEquals(0, new _1887ReductionOperationstoMaketheArrayElementsEqual().reductionOperations(new int[] {1, 1, 1}));
        Assert.assertEquals(4, new _1887ReductionOperationstoMaketheArrayElementsEqual().reductionOperations(new int[] {1,1,2,2,3}));
    }
}