public class _565ArrayNesting {

    public int arrayNesting(int[] nums) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int length = getLength(i, nums);
            maxLen = Math.max(maxLen, length);
        }
        return maxLen;
    }

    private int getLength(int i, int[] nums) {
        if (nums[i] < 0) {
            return 0;
        }
        int next = nums[i];
        nums[i] = -1;
        return 1 + getLength(next, nums);
    }

}
