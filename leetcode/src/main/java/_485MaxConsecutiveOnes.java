/**
 * Created by anton on 1/2/17.
 */
public class _485MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] == 1) {
               temp++;
           } else if (temp > 0) {
               if (temp > max) {
                   max = temp;
               }
               temp = 0;
           }
        }
        if (temp > max) {
            max = temp;
        }
        return max;
    }

    public int findMaxConsecutiveOnes2(int[] nums) {
        int max = 0;
        int temp;
        int lastZero = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                temp = i - lastZero;
                if (temp > max) {
                    max = temp;
                }
                lastZero = i;
            }
        }
        temp = nums.length - lastZero;
        if (temp > max) {
            max = temp;
        }
        return max - 1;
    }

}
