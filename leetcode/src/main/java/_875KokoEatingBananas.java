/**
 * Created by anton on 8/8/18.
 */
public class _875KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int H) {
        int h = 0;
        for (int p : piles) {
            h += p / H + (p % H == 0 ? 0 : 1);
        }
        return h;
    }
}
