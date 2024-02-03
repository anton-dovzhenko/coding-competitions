public class _3021AliceAndBobPlayingFlowerGame {

    public long flowerGame(int n, int m) {
        long pairs = 0;
        for (int i = 1; i <= n; i++) {
            pairs += m / 2;
            if (i % 2 == 0 && m % 2 == 1) {
                pairs += 1;
            }
        }
        return pairs;
    }

}
