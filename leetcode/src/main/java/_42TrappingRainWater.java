/**
 * Created by anton on 29/9/17.
 */
public class _42TrappingRainWater {

    public int trap(int[] height) {

        if (height.length < 3) {
            return 0;
        }

        int[] left = new int[height.length];
        left[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        int[] right = new int[height.length];
        right[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }

        int trapCount = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int h = Math.min(left[i - 1], right[i + 1]);
            if (h > height[i]) {
                trapCount += h - height[i];
            }
        }

        return trapCount;
    }

}
