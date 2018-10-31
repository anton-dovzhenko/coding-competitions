import java.util.Arrays;

/**
 * Created by anton on 21/2/18.
 */
public class _345ReverseVowelsofaString {

    private static final boolean[] vowels = new boolean[256];
    static {
        vowels['A'] = true;
        vowels['E'] = true;
        vowels['I'] = true;
        vowels['O'] = true;
        vowels['U'] = true;
        vowels['a'] = true;
        vowels['e'] = true;
        vowels['i'] = true;
        vowels['o'] = true;
        vowels['u'] = true;
    }

    public String reverseVowels(String s) {
        if (s.length() == 0) {
            return "";
        }
        int start = 0;
        int end = s.length() - 1;
        char[] array = s.toCharArray();
        while (true) {
            while (!vowels[array[start]] && start < end) {
                start++;
            }
            while (!vowels[array[end]] && start < end) {
                end--;
            }
            if (start >= end) {
                break;
            }
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        return new String(array);
    }

}
