import java.util.Arrays;
import java.util.Comparator;

public class _391PerfectRectangle {

    public boolean isRectangleCover(int[][] rectangles) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = 0;
        int maxY = 0;
        int area = 0;
        for (int i = 0; i < rectangles.length; i++) {
            minX = Math.min(minX, rectangles[i][0]);
            minY = Math.min(minY, rectangles[i][1]);
            maxX = Math.max(maxX, rectangles[i][2]);
            maxY = Math.max(maxY, rectangles[i][3]);
            area += (rectangles[i][2] - rectangles[i][0]) * (rectangles[i][3] - rectangles[i][1]);
        }
        if (area != (maxX - minX) * (maxY - minY)) {
            return false;
        }

        Arrays.sort(rectangles, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        for (int i = 0; i < rectangles.length; i++) {
            for (int j = i + 1; j < rectangles.length; j++) {
                int[] r1 = rectangles[i];
                int[] r2 = rectangles[j];
                if (r2[0] >= r1[2]) {
                    break;
                }
                if (doOverlap(r1, r2)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean doOverlap(int[] r1, int[] r2) {
        if (r1[2] <= r2[0] || r2[2] <= r1[0]
                || r1[3] <= r2[1] || r2[3] <= r1[1]) {
            return false;
        }
        return true;
    }


}