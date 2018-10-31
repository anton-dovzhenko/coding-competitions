import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by anton on 13/1/18.
 */
public class _118PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>(numRows);
        List<Integer> last = null;
        for (int i = 0; i < numRows; i++) {
            List<Integer> next = new ArrayList<>(i + 1);
            next.add(1);
            if (last != null) {
                for (int j = 1; j < last.size(); j++) {
                    next.add(last.get(j - 1) + last.get(j));
                }
                next.add(1);
            }
            last = next;
            triangle.add(last);
        }
        return triangle;
    }

}
