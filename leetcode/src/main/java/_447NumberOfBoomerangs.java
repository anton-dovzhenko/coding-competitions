import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by anton on 4/2/17.
 */
public class _447NumberOfBoomerangs {

    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int ij = distance(points[i], points[j]);
                for (int k = j   + 1; k < points.length; k++) {
                    int ik = distance(points[i], points[k]);
                    int kj = distance(points[k], points[j]);
                    if (ij == ik) {
                        count += 2;
                    }
                    if (ik == kj) {
                        count += 2;
                    }
                    if (ij == kj) {
                        count += 2;
                    }
                }
            }
        }
        return count;
    }

    private int distance(int[] a, int[] b) {
        return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }

}
