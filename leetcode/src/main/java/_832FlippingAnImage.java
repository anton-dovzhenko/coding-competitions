/**
 * Created by anton on 13/5/18.
 */
public class _832FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] A) {
        int [] mapping = new int[2];
        mapping[0] = 1;
        mapping[1] = 0;
        for (int i = 0; i < A.length; i++) {
            int length = A[i].length / 2;
            if (A[i].length % 2 == 1) {
                length++;
            }
            for (int j = 0; j < length; j++) {
                int temp = A[i][j];
                A[i][j] = mapping[A[i][A[i].length - 1 - j]];
                A[i][A[i].length - 1 - j] = mapping[temp];
            }
        }
        return A;
    }

}
