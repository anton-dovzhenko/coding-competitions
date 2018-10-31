import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 15/9/18.
 */
public class _25ReverseNodesinkGroupTest {
    @Test
    public void reverseKGroup() throws Exception {

        System.out.println(new _25ReverseNodesinkGroup().reverseKGroup(ListNode.fromArray(new int[] {1, 2, 3, 4, 5, 6}), 3));
        System.out.println(new _25ReverseNodesinkGroup().reverseKGroup(ListNode.fromArray(new int[] {1, 2, 3, 4, 5, 6}), 2));
        System.out.println(new _25ReverseNodesinkGroup().reverseKGroup(ListNode.fromArray(new int[] {1, 2, 3, 4, 5}), 3));



    }

}