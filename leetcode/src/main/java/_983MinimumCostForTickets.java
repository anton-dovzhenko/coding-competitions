import java.util.Arrays;

public class _983MinimumCostForTickets {

    private final int[] passValidity = new int[] {1, 7, 30};

    public int mincostTickets(int[] days, int[] costs) {
        int[] minCosts = new int[days.length + 1];
        for (int i = 1; i < minCosts.length; i++) {
            minCosts[i] = minCosts[i - 1] + costs[0];
        }
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < 3; j++) {
                int validity = passValidity[j];
                int cost = minCosts[i] + costs[j];
                int index = Arrays.binarySearch(days, days[i] + validity - 1);
                if (index < 0) {
                    index = Math.abs(index) - 2;
                }
                for (int k = index; k >= i; k--) {
                    if (minCosts[k + 1] <= cost) {
                        break;
                    } else {
                        minCosts[k + 1] = cost;
                    }
                }
            }
        }
        return minCosts[minCosts.length - 1];
    }

}
