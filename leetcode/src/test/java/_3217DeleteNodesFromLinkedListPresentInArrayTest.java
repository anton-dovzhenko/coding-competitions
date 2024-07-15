import junit.framework.TestCase;

public class _3217DeleteNodesFromLinkedListPresentInArrayTest extends TestCase {

    public void testModifiedList() {
        assertEquals(ListNode.fromArray(new int[]{4, 5}),
                new _3217DeleteNodesFromLinkedListPresentInArray().modifiedList(
                        new int[]{1, 2, 3}, ListNode.fromArray(new int[]{1, 2, 3, 4, 5})));
        assertEquals(ListNode.fromArray(new int[]{2, 2, 2}),
                new _3217DeleteNodesFromLinkedListPresentInArray().modifiedList(
                        new int[]{1}, ListNode.fromArray(new int[]{1, 2, 1, 2, 1, 2})));
        assertEquals(ListNode.fromArray(new int[]{1, 2, 3, 4}),
                new _3217DeleteNodesFromLinkedListPresentInArray().modifiedList(
                        new int[]{5}, ListNode.fromArray(new int[]{1, 2, 3, 4})));
    }
}