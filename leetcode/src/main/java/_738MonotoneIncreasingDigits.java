public class _738MonotoneIncreasingDigits {

    public int monotoneIncreasingDigits(int N) {
        char[] c = Integer.toString(N).toCharArray();
        int[] n = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            n[i] = c[i] - '0';
        }

        for (int i = 1; i < n.length; i++) {
            if (n[i] < n[i - 1]) {

                for (int j = i - 1; j >=0; j--) {
                    if (n[j] > n[j+1]) {
                        n[j + 1] = 9;
                        n[j] -= 1;
                    }
                }

                for (int j = i; j < n.length; j++) {
                    n[j] = 9;
                }
                break;
            }
        }

        int M = 0;
        for (int i = 0; i < n.length; i++) {
            M = M * 10 + n[i];
        }
        return M;
    }

}
