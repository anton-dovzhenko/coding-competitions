import org.junit.Test;

import static org.junit.Assert.*;

public class _416PartitionEqualSubsetSumTest {

    @Test
    public void canPartition() {
        assertFalse(new _416PartitionEqualSubsetSum().canPartition(new int[]{500, 10, 489, 1000, 5}));
        assertFalse(new _416PartitionEqualSubsetSum().canPartition(new int[]{1, 2, 3, 5}));
        assertTrue(new _416PartitionEqualSubsetSum().canPartition(new int[]{1, 5, 11, 5}));
        assertTrue(new _416PartitionEqualSubsetSum().canPartition(new int[]{3, 3, 2, 2, 2}));
        assertFalse(new _416PartitionEqualSubsetSum().canPartition(new int[]{
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100}));
    }
}