/**
 * Created by anton on 14/7/17.
 */
public class _541ReverseStringII {

    public String reverseStr(String s, int k) {
        char[] array = s.toCharArray();
        int sectors = 1 + s.length() / k;
        for (int i = 0; i < sectors; i++) {
            if (i % 2 == 0 && i * k < s.length()) {
                reverse(array, i * k, Math.min(i * k + k - 1, s.length() - 1));
            }
        }
        return new String(array);
    }

    public void reverse(char[] array, int start, int end) {
        for (int i = start; i <= (start + end) / 2; i++) {
            char tmp = array[i];
            array[i] = array[end - (i - start)];
            array[end - (i - start)] = tmp;
        }
    }
}
