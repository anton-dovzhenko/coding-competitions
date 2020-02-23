import org.junit.Test;

import static org.junit.Assert.*;

public class _402RemoveKDigitsTest {

    @Test
    public void removeKdigits() {

        System.out.println(new _402RemoveKDigits().removeKdigits("1432219", 3));
        System.out.println(new _402RemoveKDigits().removeKdigits("10200", 1));
        System.out.println(new _402RemoveKDigits().removeKdigits("10", 2));
        System.out.println(new _402RemoveKDigits().removeKdigits("9", 1));
        System.out.println(new _402RemoveKDigits().removeKdigits("1107", 1));
    }
}