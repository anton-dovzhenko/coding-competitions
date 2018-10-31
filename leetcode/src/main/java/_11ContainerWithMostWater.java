import java.util.Arrays;

/**
 * Created by anton on 5/2/17.
 */
public class _11ContainerWithMostWater {

    public int maxArea(int[] height) {

        int max = 0;
        int maxElement = 0;
        for (int i = 0; i < height.length - 1; i++) {
            if (height[i] < maxElement) {
                continue;
            } else {
                maxElement = height[i];
            }
            for (int j = height.length - 1; j > i; j--) {
                int area = Math.min(height[i], height[j]) * (j - i);
                if (area > max) {
                    max = area;
                }
                if (height[j] >= height[i]) {
                    break;
                }
            }
        }
        return max;
    }

}
