/**
 * Created by anton on 17/6/18.
 */
public class _852PeakIndexinaMountainArray {

    public int peakIndexInMountainArray(int[] A) {
        if (A[A.length - 2] < A[A.length - 1]) {
            return A.length - 1;
        }
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                return i - 1;
            }
        }
        return -1;
    }

}
