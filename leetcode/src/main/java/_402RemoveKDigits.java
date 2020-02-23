import java.util.LinkedList;
import java.util.List;

public class _402RemoveKDigits {

    public String removeKdigits(String num, int k) {
        String smallest = removeKdigits0(num, k);
        if (smallest.isEmpty()) {
            return "0";
        }
        int trailingZeroes = 0;
        for (int i = 0; i < smallest.length() - 1; i++) {
            if (smallest.charAt(i) == '0') {
                trailingZeroes++;
            } else {
                break;
            }
        }
        return smallest.substring(trailingZeroes);
    }

    private String removeKdigits0(String num, int k) {
        if (k == 0) {
            return num;
        }
        if (k == num.length()) {
            return "";
        }
        for (int i = 0; i <=9; i++) {
            char c = (char) ('0' + i);
            int index = num.indexOf('0' + i);
            if (index >= 0 && index <= k) {
                return c + removeKdigits0(num.substring(index + 1), k - index);
            }
        }
        return num;
    }
}
