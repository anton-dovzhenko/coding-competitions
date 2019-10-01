/**
 * Created by anton on 13/2/17.
 */
public class _48RotateImage {

    public void rotate(int[][] matrix) {
        int start = 0;
        int end = matrix.length - 1;

        while (start < end + 1) {
            for (int i = start; i < end; i++) {
                int a0 = matrix[start][i];
                int a1 = matrix[i][end];
                int a2 = matrix[end][end + start - i];
                int a3 = matrix[end + start - i][start];
                matrix[start][i] = a3;
                matrix[i][end] = a0;
                matrix[end][end + start - i] = a1;
                matrix[end + start - i][start]= a2;
            }
            start++;
            end--;
        }
    }

    public static void main(String ... args) {
        int[][] m = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new _48RotateImage().rotate(m);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
        m = new int[][] {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        new _48RotateImage().rotate(m);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "   ");
            }
            System.out.println();
        }
    }

}
