/**
 * Created by anton on 10/6/17.
 */
public class _593ValidSquare {

    /**
     * d4-d3
     * |   |
     * d1-d2
     */
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        double d12 = getSquareDistance(p1, p2);
        double d13 = getSquareDistance(p1, p3);
        double d14 = getSquareDistance(p1, p4);
        if (d12 == 0 || d13 == 0 || d14 == 0) {
            return false;
        }
        double max = Math.max(Math.max(d12, d13), d14);
        int[] d1 = p1, d2, d3, d4;
        if (d12 == max) {
            if (d13 != d14) {
                return false;
            }
            d3 = p2;
            d2 = p3;
            d4 = p4;
        } else if (d13 == max) {
            if (d12 != d14) {
                return false;
            }
            d3 = p3;
            d2 = p2;
            d4 = p4;
        } else {
            if (d12 != d13) {
                return false;
            }
            d3 = p4;
            d2 = p2;
            d4 = p3;
        }
        return getScalar(d1, d2, d4) == 0 && getScalar(d3, d2, d4) == 0;
    }

    private int getSquareDistance(int[] a, int[] b) {
        return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }

    private int getScalar(int[] A, int[] B, int[] C) {
        return (B[0] - A[0]) * (C[0] - A[0]) + (B[1] - A[1]) * (C[1] - A[1]);
    }

}
