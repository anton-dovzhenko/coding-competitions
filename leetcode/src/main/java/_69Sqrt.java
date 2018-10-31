/**
 * Created by anton on 20/7/17.
 */
public class _69Sqrt {

    public int mySqrt(int x) {
        return (int) mySqrt(0, x, x);
    }

    private long mySqrt(long start, long end, int x) {
        long middle = (start + end) / 2;
        long square = middle * middle;
        if (x == square) {
            return middle;
        } else if (end - start <= 1) {
            return end * end <= x ? end : start;
        } else if (x > square) {
            return mySqrt(middle, end, x);
        } else {
            return mySqrt(start, middle, x);
        }
    }

}
