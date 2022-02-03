import java.util.ArrayList;
import java.util.List;

public class _2100FindGoodDaystoRobtheBank {

    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int[] decOrEq = new int[security.length];
        int[] incOrEq = new int[security.length];
        for (int i = 1; i < security.length; i++) {
            decOrEq[i] = security[i] <= security[i - 1] ? decOrEq[i - 1] + 1 : 0;
        }
        for (int i = security.length - 2; i >= 0; i--) {
            incOrEq[i] = security[i] <= security[i + 1] ? incOrEq[i + 1] + 1 : 0;
        }
        List<Integer> days = new ArrayList<>();
        for (int i = time; i < security.length - time; i++) {
            if (incOrEq[i] >= time && decOrEq[i] >= time) {
                days.add(i);
            }
        }
        return days;
    }

}
