import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by anton on 26/3/17.
 */
public class _179LargestNumber {

    public String largestNumber(int[] nums) {
        if (Arrays.stream(nums).sum() == 0) {
            return "0";
        }
        List<String> stringNums = Arrays.stream(nums).mapToObj(Integer::toString).collect(Collectors.toList());
        stringNums.sort(new NumComparator());

        StringBuilder sb = new StringBuilder();
        for (String stringNum : stringNums) {
            sb.append(stringNum);
        }
        return sb.toString();
    }

    static class NumComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.charAt(0) != o2.charAt(0)) {
                return -o1.compareTo(o2);
            }
            int minLen = Math.min(o1.length(), o2.length());
            int comparison = -o1.substring(0, minLen).compareTo(o2.substring(0, minLen));
            if (comparison == 0 && o1.length() != o2.length()) {
                if (o1.length() > o2.length()) {
                    return compare(o1.substring(minLen), o2);
                }
                if (o1.length() < o2.length()) {
                    return compare(o1, o2.substring(minLen));
                }
            }
            return comparison;
        }
    }

}
