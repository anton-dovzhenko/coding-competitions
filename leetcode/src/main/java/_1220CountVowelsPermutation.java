public class _1220CountVowelsPermutation {

    // a - 0
    // e - 1
    // i - 2
    // o - 3
    // u - 4
    private int Modulo = 1_000_000_007;
    private int[][] cache;

    public int countVowelPermutation(int n) {
        cache = new int[5][n];
        long count = 0;
        count += countVowelPermutation(n - 1, 0);
        count += countVowelPermutation(n - 1, 1);
        count += countVowelPermutation(n - 1, 2);
        count += countVowelPermutation(n - 1, 3);
        count += countVowelPermutation(n - 1, 4);
        return (int) (count % Modulo);
    }

    private long countVowelPermutation(int n, int c) {

        if (n == 0) {
            return 1;
        }
        if (cache[c][n] > 0) {
            return cache[c][n];
        }

        long result = 0;
        switch (c) {
            case 0:
                result = countVowelPermutation(n - 1, 1);
                break;
            case 1:
                result = countVowelPermutation(n - 1, 0)
                        + countVowelPermutation(n - 1, 2);
                break;
            case 2:
                result = countVowelPermutation(n - 1, 0)
                        + countVowelPermutation(n - 1, 1)
                        + countVowelPermutation(n - 1, 3)
                        + countVowelPermutation(n - 1, 4);
                break;
            case 3:
                result = countVowelPermutation(n - 1, 2)
                        + countVowelPermutation(n - 1, 4);
                break;
            case 4:
                result = countVowelPermutation(n - 1, 0);
                break;
            default:
                throw new IllegalArgumentException(Integer.toString(c));
        }

        result = result % Modulo;
        cache[c][n] = (int) result;

        return result;
    }

}
