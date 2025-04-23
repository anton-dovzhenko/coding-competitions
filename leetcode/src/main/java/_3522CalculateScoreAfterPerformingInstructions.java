public class _3522CalculateScoreAfterPerformingInstructions {

    public long calculateScore(String[] instructions, int[] values) {
        long score = 0;
        int i = 0;
        while (i > -1 && i < instructions.length) {
            int value = values[i];
            if (value == Integer.MIN_VALUE) {
                break;
            } else {
                values[i] = Integer.MIN_VALUE;
            }
            if (instructions[i].equals("add")) {
                score += value;
                i++;
            } else {
                i += value;
            }
        }
        return score;
    }

}
