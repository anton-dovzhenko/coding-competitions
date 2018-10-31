import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by anton on 26/2/18.
 */
public class _390EliminationGame {

    public int lastRemaining2(int n) {
        int start = 1;
        int end = n;
        int step = 1;
        boolean direct = true;
        while (start < end) {
            boolean odd = (end - start) / step % 2 == 0;
            if (direct || odd) {
                start = start + step;
            }
            if (!direct || odd) {
                end = end - step;
            }
            direct = !direct;
            step *= 2;
        }
        return start;
    }

    // 1 2 3 4 5 6
    // 2 4 6
    //

    public int lastRemaining(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        boolean reversed = false;
        while (list.size() > 1) {
            Iterator<Integer> iterator = reversed ? list.descendingIterator() : list.iterator();
            int count = 0;
            while (iterator.hasNext()) {
                iterator.next();
                if (count++ % 2 == 0) {
                    iterator.remove();
                }
            }
            reversed = !reversed;
        }
        return list.getFirst();
    }

    // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 -> 1:16 STEP 1
    // 2 4 6 8 10 12 14 16                    -> 2:16 STEP 2
    // 2 6 10 14                              ->
    // 6 14
    // 6

}
