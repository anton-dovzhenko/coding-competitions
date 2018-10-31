import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by anton on 12/2/17.
 */
public class _22GenerateParenthesesTest {

    @Test
    public void generateParenthesis() throws Exception {
        List<String> result = new _22GenerateParentheses().generateParenthesis(3);
        System.out.print(result);
    }

}