/**
 * Created by anton on 19/1/18.
 */
public class _198HouseRobber {

    public int rob(int[] nums) {
        int lastTaken = 0;
        int lastNotTaken = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = lastNotTaken;
            lastNotTaken = Math.max(lastNotTaken, lastTaken);
            lastTaken = temp + nums[i];
            System.out.println("lastNotTaken = " + lastNotTaken);
            System.out.println("lastTaken = " + lastTaken);
        }
        return Math.max(lastNotTaken, lastTaken);
    }

}
