import java.util.Arrays;

/**
 * Created by anton on 9/2/17.
 */
public class _43MultiplyStrings {

    public String multiply(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();
        int length = length1 + length2;
        char[] result = new char[length + 1];
        Arrays.fill(result, '0');

        for (int i = 0; i < length2; i++) {
            int cut = 0;
            int mult2 = num2.charAt(length2 - 1 - i) - '0';
            for (int j = 0; j < length1; j++) {
                int mult1 = num1.charAt(length1 - 1 - j) - '0';
                int product = mult1 * mult2 + cut + (result[length - i - j] - '0');
                result[length - i - j] = (char) (product % 10 + '0');
                cut = product / 10;
            }
            if (cut > 0) {
                result[length - i - length1] = (char) (cut + '0');
            }
        }

        int i = 0;
        for (; i < length; i++) {
            if (result[i] != '0') {
                break;
            }
        }
        return new String(result, i, length + 1 - i);
    }

}
