import org.junit.Test;

import java.util.List;

public class _282ExpressionAddOperatorTest {

    @Test
    public void addOperators() {
        List<String> expressions = null;
        expressions = new _282ExpressionAddOperator().addOperators("123", 6);
        System.out.println(expressions);
        expressions = new _282ExpressionAddOperator().addOperators("232", 8);
        System.out.println(expressions);
        expressions = new _282ExpressionAddOperator().addOperators("105", 5);
        System.out.println(expressions);
        expressions = new _282ExpressionAddOperator().addOperators("00", 0);
        System.out.println(expressions);
        expressions = new _282ExpressionAddOperator().addOperators("3456237490", 9191);
        System.out.println(expressions);
        expressions = new _282ExpressionAddOperator().addOperators("1000000009", 9);
        System.out.println(expressions);
    }

}