import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by anton on 26/3/17.
 */
public class _179LargestNumber1 {

    public String largestNumber(int[] nums) {
        if (Arrays.stream(nums).sum() == 0) {
            return "0";
        }
        List<Integer> sorted = Arrays.stream(nums).boxed().sorted(new NumComparator1())
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for (Integer item : sorted) {
            sb.append(item);
        }
        return sb.toString();
    }

    static class NumComparator1 implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            int temp1 = o1;
            int temp2 = o2;
            int log1 = (int) Math.log10(temp1);
            int log2 = (int) Math.log10(temp2);
            if (log1 == log2) {
                return -Integer.compare(temp1, temp2);
            } else if (log1 < log2) {
                double power = Math.pow(10, log2 - log1);
                temp2 = (int) (temp2 / power);
                int comparison = -Integer.compare(temp1, temp2);
                if (comparison == 0) {
                    comparison = compare(temp1, temp2 % (int) power);
                }
                return comparison;
            } else {
                double power = Math.pow(10, log1 - log2);
                temp1 = (int) (temp1 / power);
                int comparison = -Integer.compare(temp1, temp2);
                if (comparison == 0) {
                    comparison = compare(temp1 % (int) power, temp2);
                }
                return comparison;
            }
        }
    }

}
