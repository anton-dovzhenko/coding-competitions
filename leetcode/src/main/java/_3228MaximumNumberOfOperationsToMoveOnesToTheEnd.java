public class _3228MaximumNumberOfOperationsToMoveOnesToTheEnd {

    public int maxOperations(String s) {
        int ones = 0;
        int sum = 0;
        int last = s.charAt(0) - '0';
        ones += last;
        for (int i = 1; i < s.length(); i++) {
            int n = s.charAt(i) - '0';
            if (n == 0 && last == 1) {
                sum += ones;
            } else if (n == 1) {
                ones++;
            }
            last = n;
        }
        return sum;
    }

}
