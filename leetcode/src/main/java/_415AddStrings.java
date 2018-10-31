/**
 * Created by anton on 4/2/17.
 */
public class _415AddStrings {

    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int order = Math.max(len1, len2);
        char[] result = new char[order + 1];
        int toAdd = 0;
        for (int i = 0; i < order; i++) {
            int digit1 = i < len1 ? (num1.charAt(len1 - i - 1) - '0') : 0;
            int digit2 = i < len2 ? (num2.charAt(len2 - i - 1) - '0') : 0;
            int sum = digit1 + digit2 + toAdd;
            toAdd = sum / 10;
            sum = sum % 10;
            result[order - i] = (char) (sum + '0');
        }
        if (toAdd > 0) {
            result[0] = '1';
        }
        return new String(result, toAdd > 0 ? 0 : 1, toAdd > 0 ? order + 1 : order);

    }

}
