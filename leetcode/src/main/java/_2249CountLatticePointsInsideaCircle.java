import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class _2249CountLatticePointsInsideaCircle {

    public int countLatticePoints(int[][] circles) {
        Set<Point> points = new HashSet<>();
        for (int[] circle : circles) {
            int x = circle[0];
            int y = circle[1];
            int r = circle[2];
            for (int i = -r; i <= r; i++) {
                int j = 0;
                while (i * i + j * j <= r * r) {
                    points.add(new Point(x + i, y + j));
                    points.add(new Point(x + i, y - j));
                    j++;
                }
            }
        }
        return points.size();
    }

}
