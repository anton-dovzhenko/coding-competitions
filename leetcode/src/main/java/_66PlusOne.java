/**
 * Created by anton on 14/3/17.
 */
public class _66PlusOne {

    public int[] plusOne(int[] digits) {
        int remainder = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int val = digits[i] + remainder;
            digits[i] = val % 10;
            remainder = val / 10;
            if (remainder == 0) {
                break;
            }
        }
        if (remainder == 1) {
            int[] digits2 = new int[digits.length + 1];
            digits2[0] = 1;
            System.arraycopy(digits, 0, digits2, 1, digits.length);
            return digits2;
        } else {
            return digits;
        }
    }

}
