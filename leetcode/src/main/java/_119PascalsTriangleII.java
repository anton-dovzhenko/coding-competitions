import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by anton on 13/1/18.
 */
public class _119PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return Collections.singletonList(1);
        }
        int[] triangle1 = new int[rowIndex + 1];
        int[] triangle2 = new int[rowIndex + 1];
        triangle1[0] = triangle1[1] = 1;
        triangle2[0] = triangle2[1] = 1;
        for (int i = 1; i < rowIndex; i++) {
            for (int j = 0; j < i; j++) {
                triangle2[j + 1] = triangle1[j] + triangle1[j + 1];
            }
            triangle2[i + 1] = 1;
            int[] temp = triangle1;
            triangle1 = triangle2;
            triangle2 = temp;
        }
        List<Integer> triangle = new ArrayList<>();
        for (int i : triangle1) {
            triangle.add(i);
        }
        return triangle;
    }

}
