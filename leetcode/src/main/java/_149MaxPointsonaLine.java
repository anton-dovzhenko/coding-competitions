import java.awt.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class _149MaxPointsonaLine {

    public int maxPoints(int[][] points) {
        if (points.length < 3) {
            return points.length;
        }
        int max = 0;
        Map<Point, Integer> duplicates = new HashMap<>();
        for (int[] point : points) {
            Point p = new Point(point[0], point[1]);
            int count = duplicates.getOrDefault(p, 0) + 1;
            max = Math.max(max, count);
            duplicates.put(p, count);
        }
        for (int i = 0; i < points.length; i++) {
            Map<BigDecimal, Integer> angles = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    int[] p1 = points[i];
                    int[] p2 = points[j];
                    if (Arrays.equals(p1, p2)) {
                        continue;
                    }
                    BigDecimal B = null;
                    if (p1[0] != p2[0]) {
                        B = BigDecimal.valueOf(p2[1] - p1[1]).divide(BigDecimal.valueOf(p2[0] - p1[0]), MathContext.DECIMAL64);
                    }
                    Integer count = angles.get(B);
                    if (count == null) {
                        count = duplicates.get(new Point(p1[0], p1[1]));
                    }
                    max = Math.max(max, count + 1);
                    angles.put(B, count + 1);
                }
            }
        }
        return max;
    }

}