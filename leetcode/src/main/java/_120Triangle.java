import java.util.Collections;
import java.util.List;

public class _120Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        for (int i = 1; i < size; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = triangle.get(i);
            row.set(0, row.get(0) + prevRow.get(0));
            row.set(i, row.get(i) + prevRow.get(i - 1));
            for (int j = 1; j < i; j++) {
                row.set(j, row.get(j) + Math.min(prevRow.get(j - 1), prevRow.get(j)));
            }
        }
        return Collections.min(triangle.get(size - 1));
    }

}
