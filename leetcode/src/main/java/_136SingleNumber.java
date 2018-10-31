/**
 * Created by anton on 1/2/17.
 */
public class _136SingleNumber {

    public int singleNumber(int[] nums) {
        int number = 0;
        for (int i = 0; i< nums.length; i++) {
            number ^= nums[i];
        }
        return number;
    }

}
