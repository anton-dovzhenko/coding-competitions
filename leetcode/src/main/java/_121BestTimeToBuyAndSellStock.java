/**
 * Created by anton on 17/7/17.
 */
public class _121BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int[] maxPrices = new int[prices.length];
        maxPrices[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            maxPrices[i] = Math.max(prices[i], maxPrices[i + 1]);
        }
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            max = Math.max(max, maxPrices[i + 1] - prices[i]);
        }
        return max;
    }

    public int maxProfit2(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int[] minPrices = new int[prices.length];
        minPrices[0] = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minPrices[i] = Math.min(prices[i], minPrices[i - 1]);
        }
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - minPrices[i - 1]);
        }
        return max;
    }


    public int maxProfit3(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }

}
