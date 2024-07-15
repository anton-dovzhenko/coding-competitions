import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class _3217DeleteNodesFromLinkedListPresentInArray {

    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> toDelete = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        while (toDelete.contains(head.val)) {
            head = head.next;
        }
        ListNode iterator = head;
        while (iterator != null && iterator.next != null) {
            if (toDelete.contains(iterator.next.val)) {
                ListNode toRemove = iterator.next;
                iterator.next = iterator.next.next;
                toRemove.next = null;
            } else {
                iterator = iterator.next;
            }
        }
        return head;
    }

}
