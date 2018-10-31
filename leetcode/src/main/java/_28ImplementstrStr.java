/**
 * Created by anton on 9/2/17.
 */
public class _28ImplementstrStr {

    public int strStr(String haystack, String needle) {

        int index = 0;
        while (haystack.length() - index >= needle.length()) {
            boolean match = true;
            for (int i = 0; i < needle.length(); i++) {
                if (haystack.charAt(index + i) != needle.charAt(i)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return index;
            }
            index++;
        }
        return -1;
    }

}
