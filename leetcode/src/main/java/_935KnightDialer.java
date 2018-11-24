import java.util.Arrays;

/**
 * Created by anton on 24/11/18.
 */
public class _935KnightDialer {

    private static final int[][] adjustent = new int[][] {{4, 6}
            , {6, 8}, {7, 9}, {4, 8}
            , {0, 3, 9}, {}, {0, 1, 7}
            , {2, 6}, {1, 3}, {2, 4}};
    private final static int mod = 1_000_000_000 + 7;


    public int knightDialer(int N) {
        if (N == 1) {
            return 10;
        }
        int[] numbers = new int[10];
        int[] nextNumbers = new int[10];
        Arrays.fill(numbers, 1);
        for (int i = 1; i < N; i++) {
            Arrays.fill(nextNumbers, 0);
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < adjustent[j].length; k++) {
                    nextNumbers[adjustent[j][k]] = (nextNumbers[adjustent[j][k]] + numbers[j]) % mod;
                }
            }
            int[] tmp = numbers;
            numbers = nextNumbers;
            nextNumbers = tmp;
        }
        int c = 0;
        for (int n : numbers) {
            c = (c + n) % mod;
        }
        return c;
    }

}
