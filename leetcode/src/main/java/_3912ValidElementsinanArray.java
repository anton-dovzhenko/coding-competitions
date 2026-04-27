import java.util.ArrayList;
import java.util.List;

public class _3912ValidElementsinanArray {

    public List<Integer> findValidElements(int[] nums) {
        List<Integer> valid = new ArrayList<>();
        int N = nums.length;
        boolean[] v = new boolean[N];
        v[0] = true;
        int n = nums[0];
        for (int i = 1; i < N; i++) {
            v[i] = nums[i] > n;
            n = Math.max(n, nums[i]);
        }

        v[N - 1] = true;
        n = nums[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            v[i] |= nums[i] > n;
            n = Math.max(n, nums[i]);
        }

        for (int i = 0; i < N; i++) {
            if (v[i]) {
                valid.add(nums[i]);
            }
        }

        return valid;
    }

}
