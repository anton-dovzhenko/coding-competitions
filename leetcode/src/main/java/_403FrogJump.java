import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by anton on 2/4/18.
 */
public class _403FrogJump {

    public boolean canCross(int[] stones) {
        Set<Point> failedStones = new HashSet<>();
        return canCross(stones, failedStones, 0, 0);
    }

    private boolean canCross(int[] stones, Set<Point> failedStones, int position, int k) {
        Point point = new Point(position, k);
        if (position == stones.length - 1) {
            return true;
        }
        if (position >= stones.length || failedStones.contains(point)) {
            return false;
        }

        boolean can = false;
        for (int i = 1; i > -2; i--) {
            int target = stones[position] + k + i;
            if (k + i < 1) {
                continue;
            }
            int nextPosition = Arrays.binarySearch(stones, target);
            if (nextPosition > -1) {
                can = canCross(stones, failedStones, nextPosition, stones[nextPosition] - stones[position]);
            }
            if (can) {
                break;
            }
        }
        if (!can) {
            failedStones.add(point);
        }
        return can;
    }

}
