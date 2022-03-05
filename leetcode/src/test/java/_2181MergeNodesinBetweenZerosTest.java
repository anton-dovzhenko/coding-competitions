import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _2181MergeNodesinBetweenZerosTest {

    @Test
    public void mergeNodes() {
        Assert.assertEquals(ListNode.fromArray(new int[] {4, 11}),
                new _2181MergeNodesinBetweenZeros().mergeNodes(
                        ListNode.fromArray(new int[] {0, 3, 1, 0, 4, 5, 2, 0})));
        Assert.assertEquals(ListNode.fromArray(new int[] {1, 3, 4}),
                new _2181MergeNodesinBetweenZeros().mergeNodes(
                        ListNode.fromArray(new int[] {0, 1, 0, 3, 0, 2, 2, 0})));
    }

}