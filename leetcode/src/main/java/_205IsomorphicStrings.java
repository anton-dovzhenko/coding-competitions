import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 18/9/17.
 */
public class _205IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        return isIsomorphic0(s, t) && isIsomorphic0(t, s);
    }

    public boolean isIsomorphic0(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> mapping = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character iso = mapping.get(s.charAt(i));
            if (iso == null) {
                mapping.put(s.charAt(i), t.charAt(i));
            } else if (iso != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
