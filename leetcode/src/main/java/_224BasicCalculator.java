/**
 * Created by anton on 17/10/18.
 */
public class _224BasicCalculator {

    public int calculate(String s) {
        return calculate(s, 0)[0];
    }

    private int[] calculate(String s, int index) {
        int val = 0;
        int n = 0;
        int signum = 1;
        for (int i = index; i < s.length();) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
                i++;
            } else {
                val += signum * n;
                n = 0;
                switch (c) {
                    case ' ':
                        i++;
                        break;
                    case '+':
                        signum = 1;
                        i++;
                        break;
                    case '-':
                        signum = -1;
                        i++;
                        break;
                    case ')':
                        return new int[]{val + signum * n, i + 1};
                    case '(':
                        int[] result = calculate(s, i + 1);
                        val = val + signum * result[0];
                        i = result[1];
                        break;
                    default:
                        throw new IllegalStateException();
                }
            }

        }
        val += signum * n;
        return new int[]{val, index};
    }

}
