public class _679_24Game {

    public boolean judgePoint24(int[] nums) {
        char[] ops = new char[]{'*', '/', '+', '-'};
        for (char op0 : ops) {
            for (char op1 : ops) {
                for (char op2 : ops) {
                    for (int i0 = 0; i0 < 4; i0++) {
                        for (int i1 = 0; i1 < 4; i1++) {
                            for (int i2 = 0; i2 < 4; i2++) {
                                for (int i3 = 0; i3 < 4; i3++) {
                                    if (i0 * i0 + i1 * i1 + i2 * i2 + i3 * i3 == 14 &&
                                            judgePoint24(nums[i0], nums[i1], nums[i2], nums[i3], op0, op1, op2)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean judgePoint24(int n0, int n1, int n2, int n3, char op0, char op1, char op2) {
        return Math.abs(eval(eval(eval(n0, n1, op0), n2, op1), n3, op2) - 24) < 1e-6
                || Math.abs(eval(eval(n0, n1, op0), eval(n2, n3, op2), op1) - 24) < 1e-6
                || Math.abs(eval(eval(n0, eval(n1, n2, op1), op0), n3, op2) - 24) < 1e-6
                || Math.abs(eval(n0, eval(n3, eval(n1, n2, op1), op2), op0) - 24) < 1e-6;
    }

    private double eval(double n1, double n2, char op) {
        switch (op) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                return n1 / n2;
            default:
                throw new IllegalArgumentException();
        }
    }

}
