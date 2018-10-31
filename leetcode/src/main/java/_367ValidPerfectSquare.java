/**
 * Created by anton on 21/2/17.
 */
public class _367ValidPerfectSquare {

    private final double error = 1e-12;

    public boolean isPerfectSquare(int num) {
        double prev = 1;
        double x = -1;
        while (true) {
            x = nextIteration(prev, num);
            if (Math.abs(x - prev) < error) {
                break;
            }
            prev = x;
        }

        return num == (int) x * x;
    }

    private double nextIteration(double prev, double num) {
        return prev - (prev * prev - num) / (2 * prev);
    }

}
