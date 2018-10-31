/**
 * Created by anton on 12/9/18.
 */
public class _23MergekSortedLists {

    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode root = lists[0];
        for (int i = 1; i < lists.length; i++) {
            ListNode list = lists[i];
            if (list == null) {
                continue;
            }
            if (root == null) {
                root = list;
                continue;
            }
            ListNode temp = new ListNode(Math.min(root.val, list.val));
            ListNode current = temp;
            if (temp.val == root.val) {
                root = root.next;
            } else {
                list = list.next;
            }
            while (root != null || list != null) {
                if (root == null) {
                    current.next = list;
                    list = null;
                } else if (list == null) {
                    current.next = root;
                    root = null;
                } else {
                    if (root.val <= list.val) {
                        current.next = root;
                        current = current.next;
                        root = root.next;
                    } else {
                        current.next = list;
                        current = current.next;
                        list = list.next;
                    }
                }
            }
            root = temp;
        }
        return root;
    }

}
