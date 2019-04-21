import org.junit.Test;

import static org.junit.Assert.*;

public class _61RotateListTest {

    @Test
    public void rotateRight() {
        System.out.println(new _61RotateList().rotateRight(ListNode.fromArray(new int[] {1, 2, 3, 4, 5}), 2));
        System.out.println(new _61RotateList().rotateRight(ListNode.fromArray(new int[] {0, 1, 2}), 4));
    }
}