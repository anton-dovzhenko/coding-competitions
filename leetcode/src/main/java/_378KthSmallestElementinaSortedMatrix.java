import java.awt.*;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by anton on 9/3/18.
 */
public class _378KthSmallestElementinaSortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {
        int colCount = matrix[0].length;
        int[] used = new int[matrix.length];
        PriorityQueue<Point> points = new PriorityQueue<>((o1, o2) -> {
            return Integer.compare(o1.x, o2.x);
        });
        for (int i = 0; i < matrix.length; i++) {
            points.add(new Point(matrix[i][0], i));
        }
        int value = matrix[0][0];
        while (k > 0) {
            Point p = points.poll();
            value = p.x;
            used[p.y]++;
            if (used[p.y] <= colCount - 1) {
                points.add(new Point(matrix[p.y][used[p.y]], p.y));
            }
            k--;
        }
        return value;
    }
}
