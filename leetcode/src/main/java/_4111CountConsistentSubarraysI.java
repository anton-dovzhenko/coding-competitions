public class _4111CountConsistentSubarraysI {

    public int countConsistent(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int bitwise = nums[i];
            for (int j = i; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
                bitwise &= nums[j];
                if (min == bitwise) {
                    cnt++;
                }
            }

        }
        return cnt;
    }


    public static void main(String ...  args) {
        System.out.println(new _4111CountConsistentSubarraysI().countConsistent(new int[] {5, 3, 1, 2}));
        System.out.println(new _4111CountConsistentSubarraysI().countConsistent(new int[] {1, 1, 1}));
        System.out.println(new _4111CountConsistentSubarraysI().countConsistent(new int[] {0}));
    }

}
