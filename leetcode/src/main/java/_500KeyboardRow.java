import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 28/1/18.
 */
public class _500KeyboardRow {

    public String[] findWords(String[] words) {
        int[] rows = new int[26];
        rows['q' - 'a'] = 0;
        rows['w' - 'a'] = 0;
        rows['e' - 'a'] = 0;
        rows['r' - 'a'] = 0;
        rows['t' - 'a'] = 0;
        rows['y' - 'a'] = 0;
        rows['u' - 'a'] = 0;
        rows['i' - 'a'] = 0;
        rows['o' - 'a'] = 0;
        rows['p' - 'a'] = 0;
        rows['a' - 'a'] = 1;
        rows['s' - 'a'] = 1;
        rows['d' - 'a'] = 1;
        rows['f' - 'a'] = 1;
        rows['g' - 'a'] = 1;
        rows['h' - 'a'] = 1;
        rows['j' - 'a'] = 1;
        rows['k' - 'a'] = 1;
        rows['l' - 'a'] = 1;
        rows['z' - 'a'] = 2;
        rows['x' - 'a'] = 2;
        rows['c' - 'a'] = 2;
        rows['v' - 'a'] = 2;
        rows['b' - 'a'] = 2;
        rows['n' - 'a'] = 2;
        rows['m' - 'a'] = 2;
        List<String> matched = new LinkedList<>();
        for (String word : words) {
            boolean matches = true;
            int row = rows[Character.toLowerCase(word.charAt(0)) - 'a'];
            for (int i = 1; i < word.length(); i++) {
                if (rows[Character.toLowerCase(word.charAt(i)) - 'a'] != row) {
                    matches = false;
                    break;
                }
            }
            if (matches) {
                matched.add(word);
            }
        }
        return matched.toArray(new String[matched.size()]);
    }

}
