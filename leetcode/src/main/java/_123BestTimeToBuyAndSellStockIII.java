/**
 * Created by anton on 18/7/17.
 */
public class _123BestTimeToBuyAndSellStockIII {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int[] profit1 = new int[prices.length];
        int[] profit2 = new int[prices.length];

        int max = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            max = Math.max(max, prices[i] - minPrice);
            profit1[i] = max;
        }

        max = 0;
        int maxPrice = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            max = Math.max(max, maxPrice - prices[i]);
            maxPrice = Math.max(maxPrice, prices[i]);
            profit2[i] = max;
        }

        max = Math.max(profit1[prices.length - 1], profit2[0]);
        for (int i = 1; i < prices.length - 1; i++) {
            max = Math.max(max, profit1[i] + profit2[i + 1]);
        }

        return max;
    }

}
