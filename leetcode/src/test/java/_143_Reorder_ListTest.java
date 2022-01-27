import org.junit.Test;

import static org.junit.Assert.*;

public class _143_Reorder_ListTest {

    @Test
    public void reorderListEven() {
        ListNode h = ListNode.fromArray(new int[] {1, 2, 3, 4});
        new _143_Reorder_List().reorderList(h);
        ListNode expected = ListNode.fromArray(new int[] {1, 4, 2, 3});
        assertEquals(expected, h);
    }

    @Test
    public void reorderListOdd() {
        ListNode h = ListNode.fromArray(new int[] {1, 2, 3, 4, 5});
        new _143_Reorder_List().reorderList(h);
        ListNode expected = ListNode.fromArray(new int[] {1, 5, 2, 4, 3});
        assertEquals(expected, h);
    }
}