/**
 * Created by anton on 17/2/18.
 */
public class _405ConvertNumbertoHexadecimal {

    private final char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
            , 'a', 'b', 'c', 'd', 'e', 'f'};

    public String toHex(int num) {
        long n = num;
        if (n == 0) {
            return "0";
        }
        if (n < 0) {
            n = 0xffffffffL + n + 1;
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(hex[(int) (n & 0b1111) ]);
            n = n >>> 4;
        }
        return sb.reverse().toString();
    }

}
