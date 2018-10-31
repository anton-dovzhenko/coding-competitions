/**
 * Created by anton on 14/5/18.
 */
public class _334IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {
        int min1 = nums[0];
        int min2 = Integer.MAX_VALUE;
        int Min1 = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];

            if (n > min1) {
                if (n > min2) {
                    return true;
                } else {
                    min2 = n;
                }
            } else if (n <= min1) {
                if (n < Min1) {
                    Min1 = n;
                } else if (n > Min1 && n <= min2) {
                    min1 = Min1;
                    min2 = n;
                    Min1 = Integer.MAX_VALUE;
                }
            }
        }
        return false;
    }

}
