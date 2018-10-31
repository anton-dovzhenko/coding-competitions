/**
 * Created by anton on 8/11/17.
 */
public class _696CountBinarySubstrings {

    public int countBinarySubstrings(String s) {
        int count = 0;
        char last = s.charAt(0);
        int prevLength = 0;
        int length = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != last) {
                last = s.charAt(i);
                prevLength = length;
                length = 1;
            } else {
                length++;
            }
            if (length <= prevLength) {
                count++;
            }
        }
        return count;
    }

}
