import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 2/7/17.
 */
public class _633SumOfSquareNumbersTest {

    @Test
    public void testJudgeSquareSum() throws Exception {
        assertTrue(new _633SumOfSquareNumbers().judgeSquareSum(5));
        assertTrue(new _633SumOfSquareNumbers().judgeSquareSum(2));
        assertTrue(new _633SumOfSquareNumbers().judgeSquareSum(0));
        assertTrue(new _633SumOfSquareNumbers().judgeSquareSum(1));
        assertTrue(new _633SumOfSquareNumbers().judgeSquareSum(1000));
        assertFalse(new _633SumOfSquareNumbers().judgeSquareSum(3));
    }

    @Test
    public void testJudgeSquareSum2() throws Exception {
        assertTrue(new _633SumOfSquareNumbers().judgeSquareSum2(5));
        assertTrue(new _633SumOfSquareNumbers().judgeSquareSum2(2));
        assertTrue(new _633SumOfSquareNumbers().judgeSquareSum2(0));
        assertTrue(new _633SumOfSquareNumbers().judgeSquareSum2(1));
        assertTrue(new _633SumOfSquareNumbers().judgeSquareSum2(1000));
        assertFalse(new _633SumOfSquareNumbers().judgeSquareSum2(3));
        assertFalse(new _633SumOfSquareNumbers().judgeSquareSum2(6));
    }

}