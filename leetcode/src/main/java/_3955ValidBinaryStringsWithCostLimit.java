import java.util.ArrayList;
import java.util.List;

public class _3955ValidBinaryStringsWithCostLimit {

    public List<String> generateValidStrings(int n, int k) {
        List<String> validStrings = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            String s = Integer.toBinaryString(i);
            s = "0".repeat(n - s.length()) + s;
            boolean conseqOne = true;
            boolean lastOne = false;
            int cost = 0;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '1') {
                    if (lastOne || cost + j > k) {
                        conseqOne = false;
                        break;
                    }
                    lastOne = true;
                    cost += j;
                } else {
                    lastOne = false;
                }
            }
            if (conseqOne && cost <= k) {
                validStrings.add(s);
            }
        }
        return validStrings;
    }

    public static void main(String ... args) {
        System.out.println(new _3955ValidBinaryStringsWithCostLimit().generateValidStrings(3, 1));
        System.out.println(new _3955ValidBinaryStringsWithCostLimit().generateValidStrings(1, 0));
    }

}
