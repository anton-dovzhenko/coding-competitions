package gcj2015.round1a;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.min;
import static java.lang.Math.sqrt;

/**
 * Created by anton on 19/12/16.
 */
public class CLogging {

    public static void main(String ... args) throws IOException {
        try (InputStream in = CLogging.class.getResourceAsStream("/2015.round1a.C-small-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                int treeCount = sc.nextInt();
                sc.nextLine();
                List<Point> trees = new ArrayList<>();
                for (int j = 0; j < treeCount; j++) {
                    String[] line = sc.nextLine().split(" ");

                    trees.add(new Point(Long.parseLong(line[0]), Long.parseLong(line[1])));
                }
                int[] cuts = getTreesToCut(trees);
                System.out.println(String.format("Case #%1$d:", i + 1));
                for (int cut : cuts) {
                    System.out.println(cut);
                }
            }
        }
    }

    public static int[] getTreesToCut(List<Point> trees) {
        int[] result = new int[trees.size()];

        for (int i = 0; i < trees.size(); i++) {
            Point a = trees.get(i);
            int minCut = trees.size() - 1;
            for (int j = 0; j < trees.size(); j++) {
                if (i == j) {
                    continue;
                }
                Point b = trees.get(j);
                int neg = 0;
                int pos = 0;
                for (int k = 0; k < trees.size(); k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    Point c = trees.get(k);
                    long area = (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x);
                    if (area > 0) {
                        pos++;
                    }
                    if (area < 0) {
                        neg++;
                    }
                }
                minCut = min(minCut, min(pos, neg));
                minCut = min(minCut, pos);
                if (minCut == 0) {
                    break;
                }
            }
            result[i] = minCut;
        }

        return result;
    }



    private static double angle(Point start, Point point) {
        long x = point.x - start.x;
        long y = point.y - start.y;
        return x / sqrt(x * x + y * y);
    }

    public static class Point {
        final long x;
        final long y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            Point point = (Point) o;
            return x == point.x && y == point.y;

        }

    }
}
