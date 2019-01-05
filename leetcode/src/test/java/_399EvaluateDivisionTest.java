import org.junit.Test;

import static org.junit.Assert.*;

public class _399EvaluateDivisionTest {

    @Test
    public void calcEquation() {
        assertArrayEquals(new double[] {6}, new _399EvaluateDivision().calcEquation(
                new String[][] {{"a", "b"}, {"b", "c"}}
                , new double[]{2, 3}
                , new String[][] {{"a", "c"}}
        ), 1e-6);
        assertArrayEquals(new double[] {0.5}, new _399EvaluateDivision().calcEquation(
                new String[][] {{"a", "b"}, {"b", "c"}}
                , new double[]{2, 3}
                , new String[][] {{"b", "a"}}
        ), 1e-6);
        assertArrayEquals(new double[] {1}, new _399EvaluateDivision().calcEquation(
                new String[][] {{"a", "b"}, {"b", "c"}}
                , new double[]{2, 3}
                , new String[][] {{"a", "a"}}
        ), 1e-6);
        assertArrayEquals(new double[] {-1}, new _399EvaluateDivision().calcEquation(
                new String[][] {{"a", "b"}, {"b", "c"}}
                , new double[]{2, 3}
                , new String[][] {{"x", "x"}}
        ), 1e-6);

    }
}