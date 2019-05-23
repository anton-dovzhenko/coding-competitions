import java.util.*;

/**
 * Created by anton on 12/2/17.
 */
public class _22GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        result.add("");
        for (int i = 0; i < n; i++) {
            List<String> nextResult = new ArrayList<>();
            for (String s : result) {
                addParenthesis(nextResult, s);
            }
            result = nextResult;
        }
        return result;
    }

    private void addParenthesis(List<String> next, String s) {
        int l0 = s.lastIndexOf('(');
        int l1 = s.length();
        s += "()";
        next.add(s);
        char[] sc = s.toCharArray();
        sc[l1] = ')';
        for (int i = l0 + 1; i < l1; i++) {
            sc[i] = '(';
            next.add(new String(sc));
            sc[i] = ')';
        }
    }

}