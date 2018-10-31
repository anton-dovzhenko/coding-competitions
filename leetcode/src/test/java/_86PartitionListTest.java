import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 27/8/17.
 */
public class _86PartitionListTest {

    @Test
    public void testPartition() throws Exception {
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        new _86PartitionList().partition(node, 0);
    }
}