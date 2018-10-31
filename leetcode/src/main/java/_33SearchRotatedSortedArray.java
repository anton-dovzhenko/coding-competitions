/**
 * Created by anton on 9/2/17.
 */
public class _33SearchRotatedSortedArray {

    public static void main(String ... args) {
        System.out.println(7 % 7);
    }

    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int startIndex = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                startIndex = i;
            }
        }
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            int midRot = getRotIndex(mid, nums.length, startIndex);
            if (nums[midRot] == target) {
                return midRot;
            } else if (nums[midRot] < target) {
                low = mid;
            } else {
                high = mid;
            }
            if (high == mid + 1) {
                break;
            }
        }
        int highRot =  getRotIndex(high, nums.length, startIndex);
        return nums[highRot] == target ? highRot : -1;
    }

    private int getRotIndex(int index, int length, int start) {
        return (start + index) % length;
    }

}
