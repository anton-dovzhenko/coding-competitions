public class _477TotalHammingDistance {


    public int totalHammingDistance(int[] nums) {
        int distance = 0;
        for (int i = 0; i < 32; i++) {
            int ones = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % 2 == 1) {
                    ones++;
                }
                nums[j] /= 2;
            }
            distance += ones * (nums.length - ones);
        }
        return distance;
    }

}
