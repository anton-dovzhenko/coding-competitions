import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 1/10/17.
 */
public class _206ReverseLinkedListTest {

    @Test
    public void testReverseList() throws Exception {
        ListNode node = null;
        ListNode reversed = null;
        node = ListNode.fromArray(new int[] {1, 2, 3, 4, 5});
        reversed = new _206ReverseLinkedList().reverseList(node);
        System.out.println(reversed);
        node = ListNode.fromArray(new int[] {1});
        reversed = new _206ReverseLinkedList().reverseList(node);
        System.out.println(reversed);
    }
}