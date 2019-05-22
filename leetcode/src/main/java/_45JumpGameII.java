public class _45JumpGameII {


    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int[] jumps = new int[nums.length];

        int i = 0;
        while (i + nums[i] >= nums.length - 1) {
            int next = i;
            int max = next;
            for (int j = 1; j <= Math.min(nums[i], nums.length - i - 1); j++) {
                if (jumps[i + j] == 0) {
                    jumps[i + j] = jumps[i] + 1;
                } else {
                    jumps[i + j] = Math.min(jumps[i + j], jumps[i] + 1);
                }
                if (i + j + nums[i + j] >= max) {
                    max = i + j + nums[i + j];
                    next = i + j;
                }
            }
            i = next;
        }

        return jumps[i] + 1;
    }

    public int jump2(int[] nums) {
        int[] jumps = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            for (int j = 1; j <= Math.min(n, nums.length - i - 1); j++) {

                if (jumps[i + j] == 0) {
                    jumps[i + j] = jumps[i] + 1;
                } else {
                    jumps[i + j] = Math.min(jumps[i + j], jumps[i] + 1);
                }

            }
        }
        return jumps[jumps.length - 1];
    }

}
