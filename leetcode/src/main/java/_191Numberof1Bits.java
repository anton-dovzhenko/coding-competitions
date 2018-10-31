/**
 * Created by anton on 7/10/17.
 */
public class _191Numberof1Bits {

    public int hammingWeight(int n) {
        int weight = 0;
        while (n != 0) {
            weight += (n & 1);
            n = n >>> 1;
        }
        return weight;
    }

}
