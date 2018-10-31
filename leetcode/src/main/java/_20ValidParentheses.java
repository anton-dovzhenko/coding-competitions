import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by anton on 14/1/17.
 */
public class _20ValidParentheses {

    public boolean isValid(String s) {
        char[] brackets = new char[255];
        brackets['}'] = '{';
        brackets[')'] = '(';
        brackets[']'] = '[';
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char open = brackets[c];
            if (open == 0) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != open) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValidNaive(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('}', '{');
        brackets.put(')', '(');
        brackets.put(']', '[');
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() > 0) {
            boolean updated = false;
            for (int i = 0; i < sb.length(); i++) {
                char c = sb.charAt(i);
                if (c == '}' || c == ']' || c == ')') {
                    if (i == 0 || sb.charAt(i - 1) != brackets.get(c)) {
                        return false;
                    }
                    else {
                        updated = true;
                        sb.delete(i - 1, i + 1);
                        break;
                    }
                }
            }
            if (!updated) {
                return false;
            }
        }
        return true;
    }

}
