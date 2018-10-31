/**
 * Created by anton on 8/3/17.
 */
public class _67AddBinary {

    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int min = Math.min(a.length(), b.length());
        int max = Math.max(a.length(), b.length());
        char[] result = new char[max + 1];
        int remainder = 0;
        for (int i = 0; i < min; i++) {
            int aVal = a.charAt(a.length() - 1 - i) - '0';
            int bVal = b.charAt(b.length() - 1 - i) - '0';
            int sum = aVal + bVal + remainder;
            remainder = sum / 2;
            result[max - i] = (char)('0' + (sum % 2));
        }
        for (int i = min; i < max; i++) {
            int aVal = a.charAt(a.length() - 1 - i) - '0';
            int sum = aVal + remainder;
            remainder = sum / 2;
            result[max - i] = (char)('0' + (sum % 2));
        }
        if (remainder == 1) {
            result[0] = '1';
        }
        return new String(result, 1 - remainder, max + remainder);
    }

}
