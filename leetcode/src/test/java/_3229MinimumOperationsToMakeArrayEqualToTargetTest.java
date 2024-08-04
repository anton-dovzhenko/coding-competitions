import org.junit.Test;

import static org.junit.Assert.*;

public class _3229MinimumOperationsToMakeArrayEqualToTargetTest {

    @Test
    public void minimumOperations() {
        assertEquals(2, new _3229MinimumOperationsToMakeArrayEqualToTarget()
                .minimumOperations(new int[] {3,5,1,2}, new int[] {4,6,2,4}));
        assertEquals(5, new _3229MinimumOperationsToMakeArrayEqualToTarget()
                .minimumOperations(new int[] {1,3,2}, new int[] {2,1,4}));
        assertEquals(20, new _3229MinimumOperationsToMakeArrayEqualToTarget()
                .minimumOperations(new int[] {9,2,6,10,4,8,3,4,2,3}, new int[] {9,5,5,1,7,9,8,7,6,5}));
        assertEquals(9, new _3229MinimumOperationsToMakeArrayEqualToTarget()
                .minimumOperations(new int[] {5,4,5,3,7,4}, new int[] {4,2,4,4,1,2}));
    }

}