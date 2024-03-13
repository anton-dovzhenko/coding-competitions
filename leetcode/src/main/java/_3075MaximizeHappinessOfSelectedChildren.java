import java.util.Arrays;

public class _3075MaximizeHappinessOfSelectedChildren {

    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long h = 0;
        for (int i = 1; i <= k; i++) {
            int score = happiness[happiness.length - i] - (i - 1);
            if (score > 0) {
                h += score;
            } else {
                break;
            }
        }
        return h;
    }

}
