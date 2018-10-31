import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by anton on 15/4/18.
 */
public class _817LinkedListComponents {

    public int numComponents(ListNode head, int[] G) {
        Set<Integer> GSet = new HashSet<>();
        for (int g : G) {
            GSet.add(g);
        }
        int conCount = 0;
        boolean prevInG = false;
        while (head != null) {
            boolean inG = GSet.contains(head.val);
            if (prevInG && inG) {
                conCount++;
            }
            prevInG = inG;
            head = head.next;
        }
        return conCount;
    }

}
