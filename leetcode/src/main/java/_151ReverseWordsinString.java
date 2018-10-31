import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Created by anton on 18/4/18.
 */
public class _151ReverseWordsinString {

    public String reverseWords(String s) {
        LinkedList<String> list = new LinkedList<>();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (start == i) {
                    start++;
                } else {
                    list.add(s.substring(start, i));
                    start = i + 1;
                }
            }
        }
        if (start < s.length()) {
            list.add(s.substring(start, s.length()));
        }
        Collections.reverse(list);
        return String.join(" ", list);
    }

}
