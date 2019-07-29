public class _410SplitArrayLargestSum {

    public int splitArray(int[] nums, int m) {
        long m1 = -1;
        long m2 = 0;
        for (int n : nums) {
            m1 = Math.max(m1, n);
            m2 += n;
        }

        while (m1 < m2) {
            long mid = (m1 + m2) / 2;
            int cuts = 1;
            int ps = 0; //partial sum
            for (int i = 0; i < nums.length; i++) {
                int n = nums[i];
                if (ps + n <= mid) {
                    ps += n;
                } else {
                    cuts += 1;
                    ps = n;
                }
            }

            if (cuts <= m) {
                m2 = mid;
            } else {
                m1 = mid;
                if (m1 + 1 == m2) {
                    return (int) m2;
                }
            }
        }
        return (int) m2;
    }

}
