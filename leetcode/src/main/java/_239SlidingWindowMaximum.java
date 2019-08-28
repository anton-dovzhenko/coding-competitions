public class _239SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (k == 0) {
            return new int[] {};
        }
        int[] maxWindow = new int[n - k + 1];

        int max = Integer.MAX_VALUE;
        int maxPos = -1;
        for (int i = k - 1; i < n; i++) {
            if (nums[i] >= max) {
                maxPos = i;
                max = nums[i];
            } else {
                if (i - maxPos >= k) {
                    maxPos = i;
                    max = nums[i];
                    for (int j = i - 1; j > i - k; j--) {
                        if (nums[j] > max) {
                            max = nums[j];
                            maxPos = j;
                        }
                    }


                }
            }
            maxWindow[i - k + 1] = max;
        }

        return maxWindow;
    }

    public int[] maxSlidingWindow0(int[] nums, int k) {
        int n = nums.length;
        if (k == 0) {
            return new int[] {};
        }
        int[] maxWindow = new int[n - k + 1];

        for (int i = 0; i < n - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            maxWindow[i] = max;
        }
        return maxWindow;
    }

}
