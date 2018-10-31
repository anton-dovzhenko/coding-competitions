/**
 * Created by anton on 31/1/17.
 */
public class _476NumberComplement {

    public int findComplement(int num) {
        if (num == 0) {
            return 1;
        }
        int helper = Integer.MAX_VALUE >> (Integer.numberOfLeadingZeros(num) - 1);
        return num ^ helper;
    }

}

