import java.util.Arrays;

public class _3074AppleRedistributionIntoBoxes {

    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int appleCnt = 0;
        for (int a: apple) {
            appleCnt += a;
        }
        int boxes = 0;
        do {
            appleCnt -= capacity[capacity.length - ++boxes];
        } while (appleCnt > 0);
        return boxes;
    }

}
