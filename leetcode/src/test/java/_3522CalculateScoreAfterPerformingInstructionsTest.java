import org.junit.Test;

import static org.junit.Assert.*;

public class _3522CalculateScoreAfterPerformingInstructionsTest {

    @Test
    public void calculateScore() {
        assertEquals(1, new _3522CalculateScoreAfterPerformingInstructions().calculateScore(
                new String[]{"jump", "add", "add", "jump", "add", "jump"},
                new int[]{2, 1, 3, 1, -2, -3}));
        assertEquals(0, new _3522CalculateScoreAfterPerformingInstructions().calculateScore(
                new String[]{"jump"},
                new int[]{0}));
        assertEquals(0, new _3522CalculateScoreAfterPerformingInstructions().calculateScore(
                new String[]{"jump","add","add"},
                new int[]{3,1,1}));
    }

}