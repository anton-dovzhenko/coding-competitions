import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by anton on 12/2/17.
 */
public class _22GenerateParenthesesTest {

    @Test
    public void generateParenthesis1() {
        assertOutputEquals(new _22GenerateParentheses().generateParenthesis(1),
                new ArrayList<>(Arrays.asList("()")));
    }

    @Test
    public void generateParenthesis2() {
        assertOutputEquals(new _22GenerateParentheses().generateParenthesis(2),
                new ArrayList<>(Arrays.asList("()()", "(())")));
    }

    @Test
    public void generateParenthesis3() {
        assertOutputEquals(new _22GenerateParentheses().generateParenthesis(3),
                new ArrayList<>(Arrays.asList("()()()", "()(())", "(())()", "((()))", "(()())")));
    }

    private void assertOutputEquals(List<String> expected, List<String> actual) {
        Collections.sort(actual);
        Collections.sort(expected);
        assertEquals(expected, actual);
    }

}