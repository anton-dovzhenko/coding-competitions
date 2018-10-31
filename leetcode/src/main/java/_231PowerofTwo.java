/**
 * Created by anton on 25/2/17.
 */
public class _231PowerofTwo {

    public boolean isPowerOfTwo(int n) {
        int temp = 1;
        while (temp < n && temp > 0) {
            temp *= 2;
        }
        return n == temp;
    }

    public boolean isPowerOfTwo2(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }

    public boolean isPowerOfTwo3(int n) {
        return n > 0 && (n | (n - 1)) == 2*n-1;
    }
}
