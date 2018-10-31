import java.util.BitSet;

/**
 * Created by anton on 28/1/17.
 */
public class _461HammingDistance {

    public int hammingDistance(int x, int y) {
        long xor = x ^ y;
        int distance = 0;
        while (xor > 0) {
            distance += xor % 2;
            xor /= 2;
        }
        return distance;
    }

    public int hammingDistanceShort(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

}
