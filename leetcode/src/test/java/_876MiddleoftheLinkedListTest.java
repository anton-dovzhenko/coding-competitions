import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 29/7/18.
 */
public class _876MiddleoftheLinkedListTest {
    @Test
    public void middleNode() throws Exception {
        ListNode head = ListNode.fromArray(new int[] {1, 2, 3, 4, 5});
        ListNode middle = new _876MiddleoftheLinkedList().middleNode(head);
        assertEquals(3, middle.val);
        head = ListNode.fromArray(new int[] {1, 2, 3, 4, 5, 6});
        middle = new _876MiddleoftheLinkedList().middleNode(head);
        assertEquals(4, middle.val);
        head = ListNode.fromArray(new int[] {1});
        middle = new _876MiddleoftheLinkedList().middleNode(head);
        assertEquals(1, middle.val);
    }

}