/**
 * Created by anton on 19/2/18.
 */
public class _413ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) {
            return 0;
        }
        int sliceCount = 0;
        int sliceStart = 0;
        int diff = A[1] - A[0];
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] != diff) {
                sliceCount += getSliceCount(i - sliceStart);
                diff = A[i] - A[i - 1];
                sliceStart = i - 1;
            }
        }
        sliceCount += getSliceCount(A.length - sliceStart);
        return sliceCount;
    }

    private int getSliceCount(int length) {
        if (length < 3) {
            return 0;
        }
        return (length - 1) * (length - 2) / 2;
    }
    // 1 2 3 4 5 6
    // 0 1 2 10

}
