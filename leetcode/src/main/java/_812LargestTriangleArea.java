import static java.lang.Math.*;
import static java.lang.Math.abs;
import static java.lang.Math.max;

/**
 * Created by anton on 15/5/18.
 */
public class _812LargestTriangleArea {

    public double largestTriangleArea(int[][] points) {
        double max = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++)
                for (int k = j + 1; k < points.length; k++) {
                    int minX = min(min(points[i][0], points[j][0]), points[k][0]);
                    int maxX = max(max(points[i][0], points[j][0]), points[k][0]);
                    int minY = min(min(points[i][1], points[j][1]), points[k][1]);
                    int maxY = max(max(points[i][1], points[j][1]), points[k][1]);
                    double square = (maxX - minX) * (maxY - minY);
                    square -= 0.5 * abs((points[i][0] - points[j][0]) * (points[i][1] - points[j][1]));
                    square -= 0.5 * abs((points[i][0] - points[k][0]) * (points[i][1] - points[k][1]));
                    square -= 0.5 * abs((points[j][0] - points[k][0]) * (points[j][1] - points[k][1]));
                    square -= min(abs(points[i][0] - minX), abs(points[i][0] - maxX)) * min(abs(points[i][1] - minY), abs(points[i][1] - maxY));
                    square -= min(abs(points[j][0] - minX), abs(points[j][0] - maxX)) * min(abs(points[j][1] - minY), abs(points[j][1] - maxY));
                    square -= min(abs(points[k][0] - minX), abs(points[k][0] - maxX)) * min(abs(points[k][1] - minY), abs(points[k][1] - maxY));
                    max = max(max, square);
                }
        }
        return max;
    }


}
