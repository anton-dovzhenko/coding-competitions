/**
 * Created by anton on 1/2/17.
 */
public class _344ReverseString {

    public String reverseString(String s) {
        int length = s.length();
        char[] reversed = new char[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = s.charAt(length - i - 1);
        }
        return String.valueOf(reversed);
    }

}
